package com.example.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_birthday_greeting.*
import android.os.Bundle as Bundle1

class BirthdayGreetingActivity : AppCompatActivity() {
    companion object{
        const val NAME_EXTRA="name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle1?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)

        val name=intent.getStringExtra(NAME_EXTRA)
        birthdayGreetings.text="Happy Birthday\n$name!"
    }
}