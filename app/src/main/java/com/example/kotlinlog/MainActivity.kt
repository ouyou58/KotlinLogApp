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

    //抽象クラスAnimal
    abstract class Animal {
        var name: String
        var age: Int

        constructor(name:String,age:Int) {
        this.name = name
        this.age = age
        }

        abstract fun say()
    }

    interface Thinkable {
        fun think()
    }

    open class Human : Animal,Thinkable {
        var hobby : String

        constructor(name:String,age:Int,hobby: String) :super(name,age) {
            this.hobby = hobby

        }
//        constructor(name: String,age: Int) : this(name,age,""){
//
//        }
//        constructor(hobby:String):this("",0,hobby) {
//
//        }


        override fun say() {
            Log.d("kotlintest1","私の名前は" + this.name + "です。年は" + this.age
             + "歳です。")
        }

        override fun think() {
            Log.d("kotlintest1","私は" + this.hobby + "について考える。")

        }
    }
}
