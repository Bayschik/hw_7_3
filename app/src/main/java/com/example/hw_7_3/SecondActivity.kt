package com.example.hw_7_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hw_7_3.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val receiveData = intent.getStringExtra("key")
        binding.textFromMain.text = receiveData
    }
}