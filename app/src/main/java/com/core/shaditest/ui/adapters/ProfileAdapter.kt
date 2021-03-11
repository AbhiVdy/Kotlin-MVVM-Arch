package com.core.shaditest.ui.adapters

import android.graphics.BitmapFactory
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.core.shaditest.R
import com.core.shaditest.data.model.Profiles
import com.mikhaellopez.circularimageview.CircularImageView
import com.squareup.picasso.Picasso
import java.lang.StringBuilder
import java.net.URL

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
            holder.bind(it[position])
        }
    }

    override fun getItemCount(): Int {
        profileList?.let {
            return it.size
        }
        return 0
    }

    class ProfileViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private var tvName : TextView = itemView.findViewById(R.id.tvName)
        private var ivProfile : CircularImageView = itemView.findViewById(R.id.ivProfile)
        private var tvAge : TextView = itemView.findViewById(R.id.tvAge)

        fun bind(profile: Profiles) {
            val strBuilder = StringBuilder()
            strBuilder.append(profile.name.title).append(". ").append(profile.name.first).append(" ").append(profile.name.last)
            tvName.text = strBuilder.toString()
            Picasso.get().load(profile.picture.large).into(ivProfile)
            tvAge.text = profile.dob.age.toString()
        }
    }

    interface ProfileEventListener {
        fun onPageIncresed()
    }
}