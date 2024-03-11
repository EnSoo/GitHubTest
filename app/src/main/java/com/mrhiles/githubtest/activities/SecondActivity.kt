package com.mrhiles.githubtest.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mrhiles.githubtest.R
import com.mrhiles.githubtest.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private val binding by lazy { ActivitySecondBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}