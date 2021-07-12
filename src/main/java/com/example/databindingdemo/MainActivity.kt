package com.example.databindingdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databindingdemo.databinding.ActivityMainBinding
import java.util.jar.Attributes

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private var aPerson : Person = Person("Ali","1234512","test@gmail.com","123 jalan ABC")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView (this, R.layout.activity_main)
        binding.personData = aPerson

        /*
        binding.nameResult.text= aPerson.Name
        binding.ICResult.text=aPerson.IC
        binding.emailResult.text=aPerson.email
        binding.addressReult.text=aPerson.address
        */
        binding.btnUpdate.setOnClickListener(){
            aPerson.email="abc@gmail.com"

            binding.apply { invalidateAll() }

        }
    }
}