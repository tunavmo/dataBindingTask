package com.vmodev.telesense_databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.databinding.DataBindingUtil
import com.vmodev.telesense_databinding.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.home_fragment.*

class MainActivity : AppCompatActivity() {
    var binding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        supportFragmentManager.beginTransaction().replace(R.id.frame_layout, HomeFragment()).commit()

    }
}