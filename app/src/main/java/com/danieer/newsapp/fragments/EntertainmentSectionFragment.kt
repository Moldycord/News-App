package com.danieer.newsapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.danieer.newsapp.R

class EntertainmentSectionFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_entertainment_section, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            EntertainmentSectionFragment()
    }
}