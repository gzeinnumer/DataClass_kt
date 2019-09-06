package com.gzeinnumer.dataclasskt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //copying
        val u1 = User("Zein", 21)
        val u2 = u1.copy()
        val u3 = u1.copy(nama = "pai")

        println(u1.component1())//Zein
        println(u1.component2())//21
        println("u1 "+u1.nama +" "+u1.umur)
        println("u2 "+u2.nama +" "+u2.umur)
        println("u3 "+u3.nama +" "+u3.umur)

        //toString
        val u4 = u1.toString()
        println(u4)

        //hashcode
        val u5 = u1.hashCode()
        println("Hashcode : "+u5)

        val u6 = u1.copy()

        //equals
        if(u5.equals(u6) == true)
            println("u5 u6 sama")
        else
            println("u5 dan u5 beda")

        //destructuring declaration
        val u7 = User("Zein", 21)
        val (nama1, umur1) = u1
        println(nama1)


    }
}

data class User(val nama:String, val umur: Int)
