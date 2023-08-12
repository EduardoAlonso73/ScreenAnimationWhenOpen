package com.example.openscreenanimation.ui

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.openscreenanimation.databinding.ActivitySecondBinding
import com.example.openscreenanimation.utils.extension.Constants

class SecondActivity : AppCompatActivity() {
    private lateinit var mBinding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding= ActivitySecondBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
        val name= intent.getStringExtra(Constants.NAME)
        val color= intent.getIntExtra(Constants.COLOR,-1)
        Log.i("SecondActivity","Color get: $color")
        window.statusBarColor = ContextCompat.getColor(this, color)
        mBinding.tvName.text=name
        mBinding.layoutContainer.background=ContextCompat.getDrawable(this,color)
    }
}