package com.gdhivagar.deviceinfosample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gdhivagar.deviceinfosample.databinding.ActivityMainBinding
import com.gdhivagar.mylibrary.GetDeviceInfo

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvDeviceManufacturer.text = GetDeviceInfo.getDeviceBrand()
        binding.tvDeviceId.text = GetDeviceInfo.getDeviceId(contentResolver)
        binding.tvDeviceUUID.text = GetDeviceInfo.getUUID()

    }


}