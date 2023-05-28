package com.dkgtech.instagramclone.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.dkgtech.instagramclone.R
import com.dkgtech.instagramclone.models.HomeModel

class HomeRecyclerAdapter(val context: Context, val arrHome: ArrayList<HomeModel>) :
    RecyclerView.Adapter<HomeRecyclerAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgUserProfileImage = itemView.findViewById<ImageView>(R.id.imgUserProfileImage)
        val txtUsername = itemView.findViewById<TextView>(R.id.txtUsername)
        val imgPostImage = itemView.findViewById<ImageView>(R.id.imgPostImage)
        val txtUserLikes = itemView.findViewById<TextView>(R.id.txtUserLikes)
        val txtUserId = itemView.findViewById<TextView>(R.id.txtUserId)
        val txtPostTitle = itemView.findViewById<TextView>(R.id.txtPostTitle)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.home_row, parent, false))
    }

    override fun getItemCount(): Int {
        return arrHome.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imgUserProfileImage.setImageResource(arrHome[position].userProfileImage)
        holder.imgPostImage.setImageResource(arrHome[position].userPostImage)
        holder.txtUsername.text = arrHome[position].username
        holder.txtUserLikes.text = arrHome[position].userLikes
        holder.txtUserId.text = arrHome[position].userId
        holder.txtPostTitle.text = arrHome[position].userPostTitle

    }
}