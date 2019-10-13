package com.april21dev.androidbase.util

import android.content.Context
import android.content.Intent
import com.april21dev.androidbase.activity.MotionBasicActivity
import com.april21dev.androidbase.activity.QuickSettingActivity

class Navigator {
    companion object {

        fun motionBasic(context: Context) {
            context.startActivity(Intent(context, MotionBasicActivity::class.java))
        }

        fun motionQuickSeting(context: Context) {
            context.startActivity(Intent(context, QuickSettingActivity::class.java))
        }
    }
}