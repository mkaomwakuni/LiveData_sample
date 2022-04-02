package com.mkao.livedatasample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModel
import com.mkao.livedatasample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mainActivityViewmodel:MainActivityViewmodel by viewModels()

        mainActivityViewmodel.liveDataCounter.observe(this) {
            binding.Counter.text = mainActivityViewmodel.liveDataCounter.value.toString()
        }
        //triggers the function everytime the button is clicked

        binding.button.setOnClickListener {
            mainActivityViewmodel.increaseNumber()
        }
    }
}