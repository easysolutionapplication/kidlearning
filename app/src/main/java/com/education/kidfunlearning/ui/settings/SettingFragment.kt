package com.education.kidfunlearning.ui.settings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.education.kidfunlearning.R

class SettingFragment : Fragment() {

    private lateinit var settingViewModel: SettingViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        settingViewModel =
                ViewModelProviders.of(this).get(SettingViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_statistic, container, false)
        val textView: TextView = root.findViewById(R.id.text_notifications)
        settingViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}
