package com.core.shaditest.ui.main

import android.os.Bundle
import android.os.Handler
import android.view.View.VISIBLE
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.core.shaditest.data.helper.NetworkHelper
import com.core.shaditest.data.model.Profiles
import com.core.shaditest.data.model.ResponseModel
import com.core.shaditest.data.network.NetworkServiceImpl
import com.core.shaditest.databinding.ActivityMainBinding
import com.core.shaditest.ui.base.MainViewModel
import com.core.shaditest.ui.base.VMFactory
import com.core.shaditest.utils.Constants
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity(), ProfileAdapter.ProfileEventListener {

    private lateinit var binding: ActivityMainBinding
    private lateinit var mainViewModel: MainViewModel
    private var responseModel: ResponseModel? = null
    private var profilesList: ArrayList<Profiles>? = null
    private var profileAdapter: ProfileAdapter? = null
    private var currSize = 10

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvProfiles.layoutManager = LinearLayoutManager(this)

        setUI()
        setViewModel()
        fetchData()
    }

    private fun setUI() {
        profileAdapter = ProfileAdapter(profilesList, this)
        binding.rvProfiles.adapter = profileAdapter
    }

    private fun setViewModel() {
        mainViewModel = ViewModelProvider(
            this,
            VMFactory(application, NetworkHelper(NetworkServiceImpl()), currSize)
        ).get(MainViewModel::class.java)
    }

    private fun fetchData() {
        if (Constants.isOnline(this)) {
            mainViewModel.getProfileList().observe(this, Observer {
                when (it.status) {
                    Constants.Status.SUCCESS -> {
                        responseModel = it?.data
                        responseModel?.let { it1 ->
                            addDataToList(it1)
                            lifecycleScope.launch {
                                mainViewModel.saveToDatabase(it1)
                            }
                        }

                    }
                    Constants.Status.ERROR -> {
                        Toast.makeText(this, it.msg, Toast.LENGTH_LONG).show()
                    }
                    Constants.Status.LOADING -> {
                        binding.progressIndicator.visibility = VISIBLE
                    }
                }
            })
        }
    }

    private fun addDataToList(responseModel: ResponseModel) {
        if (profilesList == null) {
            profilesList = responseModel.results as ArrayList<Profiles>
            profileAdapter = ProfileAdapter(profilesList, this)
            binding.rvProfiles.adapter = profileAdapter
        } else {
            profilesList?.addAll(responseModel.results)
            profileAdapter?.notifyDataSetChanged()
        }
    }

    override fun onPageIncresed() {
        if (Constants.isOnline(this))
            mainViewModel.getProfiles(currSize)
    }

    override fun onActionButtonClicked(
        profile: Profiles,
        pos: Int,
        status: Constants.SELECTION_STATUS
    ) {
        when (status) {
            Constants.SELECTION_STATUS.ACCEPT -> {
                profile.status = Constants.SELECTION_STATUS.ACCEPT
                profilesList?.let {
                    it.removeAt(pos)
                    it.add(pos, profile)
                    profileAdapter?.notifyDataSetChanged()
                }
                binding.rvProfiles.smoothScrollToPosition(pos + 1)
            }
            Constants.SELECTION_STATUS.REJECT -> {
                binding.rvProfiles.smoothScrollToPosition(pos + 1)
                profile.status = Constants.SELECTION_STATUS.REJECT
                Handler().postDelayed({
                    profilesList?.let {
                        it.remove(profile)
                        profileAdapter?.notifyDataSetChanged()
                    }
                }, 1500)
            }
            Constants.SELECTION_STATUS.NONE -> {
                profile.status = Constants.SELECTION_STATUS.NONE
                profilesList?.let {
                    it.removeAt(pos)
                    it.add(pos, profile)
                    profileAdapter?.notifyDataSetChanged()
                }
            }
        }

    }
}
