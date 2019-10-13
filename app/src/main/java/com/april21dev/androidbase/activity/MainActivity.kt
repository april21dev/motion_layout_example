package com.april21dev.androidbase.activity

import android.os.Bundle
import com.april21dev.androidbase.R
import com.april21dev.androidbase.util.Navigator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        motionBasic.setOnClickListener { Navigator.motionBasic(this) }
        quickSetting.setOnClickListener { Navigator.motionQuickSeting(this) }
    }
}
