package com.example.sayhi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.widget.addTextChangedListener
import com.example.sayhi.databinding.ActivityMainBinding
import com.google.android.material.switchmaterial.SwitchMaterial

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        iniView()

    }

    fun iniView() {

        binding.switchbtn.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {
                Log.e("logCat", "true")
            } else {
                Log.e("logCat", "false")

            }
        }
        binding.editText.addTextChangedListener {
            Log.e("logCat", "$it")

        }
    }

}