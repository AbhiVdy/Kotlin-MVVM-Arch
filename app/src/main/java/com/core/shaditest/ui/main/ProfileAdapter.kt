package com.core.shaditest.ui.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.core.shaditest.R
import com.core.shaditest.data.model.Profiles
import com.core.shaditest.utils.Constants
import com.mikhaellopez.circularimageview.CircularImageView
import com.squareup.picasso.Picasso

class ProfileAdapter(
    private val profileList: List<Profiles>?,
    private val listener: ProfileEventListener
) :
    RecyclerView.Adapter<ProfileAdapter.ProfileViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileViewHolder {

        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.layout_profile, parent, false)
        return ProfileViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ProfileViewHolder, position: Int) {
        profileList?.let {
            if (position == profileList.size - 1) {
                listener.onPageIncresed()
            }
            holder.bind(it[position], listener, position)
        }
    }

    override fun getItemCount(): Int {
        profileList?.let {
            return it.size
        }
        return 0
    }

    class ProfileViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private var tvName: TextView = itemView.findViewById(R.id.tvName)
        private var ivProfile: CircularImageView = itemView.findViewById(R.id.ivProfile)
        private var tvAge: TextView = itemView.findViewById(R.id.tvAge)
        private var ivFlag: ImageView = itemView.findViewById(R.id.ivFlag)
        private var btnAccept: Button = itemView.findViewById(R.id.btnAccept)
        private var btnReject: Button = itemView.findViewById(R.id.btnReject)
        private var btnCancelRequest: Button = itemView.findViewById(R.id.btnCancelRequest)
        private var llAction: LinearLayout = itemView.findViewById(R.id.llAction)
        private var llAccept: LinearLayout = itemView.findViewById(R.id.llAccept)
        private var llReject: LinearLayout = itemView.findViewById(R.id.llReject)

        fun bind(profile: Profiles, listener: ProfileEventListener, position: Int) {
            val strBuilder = StringBuilder()
            strBuilder.append(profile.name?.first).append(" ").append(profile.name?.last)
            tvName.text = strBuilder.toString()
            Picasso.get().load(profile.picture?.large).into(ivProfile)
            tvAge.text = "Age: " + profile.dob?.age.toString()
            ivFlag.setImageResource(Constants.getFlagByNat(profile.nat))

            llAction.visibility = View.GONE
            llAccept.visibility = View.GONE
            llReject.visibility = View.GONE

            profile.status?.let {
                when (profile.status) {
                    Constants.SELECTION_STATUS.ACCEPT -> llAccept.visibility = View.VISIBLE
                    Constants.SELECTION_STATUS.REJECT -> llReject.visibility = View.VISIBLE
                    Constants.SELECTION_STATUS.NONE -> llAction.visibility = View.VISIBLE
                    else -> llAction.visibility = View.VISIBLE
                }
            } ?: kotlin.run { llAction.visibility = View.VISIBLE }


            btnAccept.setOnClickListener {
                listener.onActionButtonClicked(profile, position, Constants.SELECTION_STATUS.ACCEPT)
                llAccept.visibility = View.VISIBLE
                llAction.visibility = View.GONE
            }
            btnReject.setOnClickListener {
                listener.onActionButtonClicked(profile, position, Constants.SELECTION_STATUS.REJECT)
                llReject.visibility = View.VISIBLE
                llAction.visibility = View.GONE
            }
            btnCancelRequest.setOnClickListener {
                listener.onActionButtonClicked(profile, position, Constants.SELECTION_STATUS.NONE)
                llAccept.visibility = View.GONE
                llAction.visibility = View.VISIBLE
            }
        }
    }

    interface ProfileEventListener {
        fun onPageIncresed()
        fun onActionButtonClicked(profile: Profiles, pos: Int, status: Constants.SELECTION_STATUS)
    }
}