package com.dkgtech.instagramclone.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dkgtech.instagramclone.R
import com.dkgtech.instagramclone.databinding.FragmentReelsBinding


class ReelsFragment : Fragment() {

    lateinit var binding: FragmentReelsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentReelsBinding.inflate(inflater, container, false)
        return binding.root
    }

}