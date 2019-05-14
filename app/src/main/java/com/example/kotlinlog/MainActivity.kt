package com.example.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human1 = Human("John",5,"週末はどこに遊びますか")
        human1.say()
        human1.think()

        val human2 = Human("ワンワン",10,"晩ごはん何を食べましか")
        human2.say()
        human2.think()
    }
    
}
