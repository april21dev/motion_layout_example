package com.april21dev.androidbase.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import com.april21dev.androidbase.R

/**
 * KeyFrame Basic
 */
class MotionExView4 @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {

    init {
        LayoutInflater.from(context).inflate(R.layout.motion_layout_ex4, this, true)
    }
}