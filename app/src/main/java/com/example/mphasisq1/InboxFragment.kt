package com.example.mphasisq1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

class InboxFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_inbox, container, false)

        val settingsButton : Button = view.findViewById(R.id.settingsButton)

        settingsButton.setOnClickListener() {
            it.findNavController().navigate(R.id.action_inboxFragment_to_settingsFragment)
        }


        return view
    }

}