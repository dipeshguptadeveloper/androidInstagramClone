package com.dkgtech.instagramclone.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.dkgtech.instagramclone.R
import com.dkgtech.instagramclone.adapters.HomeRecyclerAdapter
import com.dkgtech.instagramclone.databinding.FragmentHomeBinding
import com.dkgtech.instagramclone.models.HomeModel

class HomeFragment : Fragment() {

    lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        val arrHomes = ArrayList<HomeModel>().apply {
            add(
                HomeModel(
                    R.drawable.user_1,
                    "officialdipeshgupta",
                    R.drawable.img_1,
                    "100 Likes",
                    "officialdipeshgupta",
                    " Hello, how are you guys 😀"
                )
            )
            add(
                HomeModel(
                    R.drawable.user_1,
                    "officialdipeshgupta",
                    R.drawable.img_2,
                    "100 Likes",
                    "officialdipeshgupta",
                    " Hello, how are you guys 😀"
                )
            )
            add(
                HomeModel(
                    R.drawable.user_1,
                    "officialdipeshgupta",
                    R.drawable.img_3,
                    "100 Likes",
                    "officialdipeshgupta",
                    " Hello, how are you guys 😀"
                )
            )
            add(
                HomeModel(
                    R.drawable.user_1,
                    "officialdipeshgupta",
                    R.drawable.img_4,
                    "100 Likes",
                    "officialdipeshgupta",
                    " Hello, how are you guys 😀"
                )
            )
            add(
                HomeModel(
                    R.drawable.user_1,
                    "officialdipeshgupta",
                    R.drawable.img_5,
                    "100 Likes",
                    "officialdipeshgupta",
                    " Hello, how are you guys 😀"
                )
            )
            add(
                HomeModel(
                    R.drawable.user_1,
                    "officialdipeshgupta",
                    R.drawable.img_6,
                    "100 Likes",
                    "officialdipeshgupta",
                    " Hello, how are you guys 😀"
                )
            )
            add(
                HomeModel(
                    R.drawable.user_1,
                    "officialdipeshgupta",
                    R.drawable.img_7,
                    "100 Likes",
                    "officialdipeshgupta",
                    " Hello, how are you guys 😀"
                )
            )
            add(
                HomeModel(
                    R.drawable.user_1,
                    "officialdipeshgupta",
                    R.drawable.img_3,
                    "100 Likes",
                    "officialdipeshgupta",
                    " Hello, how are you guys 😀"
                )
            )
        }

        binding.HomeRecyclerView.layoutManager = LinearLayoutManager(context)
        binding.HomeRecyclerView.adapter = context?.let { HomeRecyclerAdapter(it, arrHomes) }
        return binding.root
    }

}