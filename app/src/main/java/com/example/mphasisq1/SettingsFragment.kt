package com.example.mphasisq1

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import androidx.fragment.app.viewModels
import androidx.navigation.findNavController
import com.example.mphasisq1.view.MailViewModel

class SettingsFragment : Fragment() {

    val vm : MailViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_settings, container, false)

        val checkAutoSpamDeletion : CheckBox = view.findViewById(R.id.checkAutoSpamDeletion)
        val checkAutoCacheClear : CheckBox = view.findViewById(R.id.checkAutoCacheClear)
        val checkAutoSync : CheckBox = view.findViewById(R.id.checkAutoSync)
        val inboxButton : Button = view.findViewById(R.id.inboxButton)

        val spamPref = activity?.getSharedPreferences(
            getString(R.string.autoSpamDeletion), Context.MODE_PRIVATE)

        inboxButton.setOnClickListener() {
            inboxButton.findNavController().navigate(R.id.action_settingsFragment_to_inboxFragment)
        }

        if(spamPref?.getBoolean("autoSpamDeletion",false)!!){

        checkAutoSpamDeletion.setOnClickListener() {
            if (checkAutoSpamDeletion.isChecked) {
                spamPref?.edit()?.putBoolean("autoSpamDeletion", true)
            }
        }

        }
        return view
    }

}