package com.zybooks.lightsout

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.zybooks.lightsout.databinding.FragmentHelpBinding

class HelpFragment : Fragment() {
    private lateinit var binding: FragmentHelpBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        binding = FragmentHelpBinding.inflate(layoutInflater, container, false)

        val lightbulbimage = binding.lightBulbImage

        lightbulbimage.setOnClickListener {
            parentFragmentManager.commit {
                replace<GameFragment>(R.id.fragment_container_view)
                setReorderingAllowed(true)
                addToBackStack("null") // name can be null
            }
        }
        return binding.root


    }

}