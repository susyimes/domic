package com.lyft.domic.android

import com.lyft.domic.api.Button
import com.lyft.domic.api.TextView

class AndroidButton(private val realButton: android.widget.Button) : Button {

    private val asTextView: TextView = AndroidTextView(realButton)

    override val observe: Button.Observe = object : Button.Observe, TextView.Observe by asTextView.observe {

    }

    override val change: Button.Change = object : Button.Change, TextView.Change by asTextView.change {

    }
}
