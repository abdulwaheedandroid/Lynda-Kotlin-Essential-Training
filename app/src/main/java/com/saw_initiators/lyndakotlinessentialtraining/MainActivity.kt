package com.saw_initiators.lyndakotlinessentialtraining

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    enum class Suit {
        Club, Diamond, Heart, Spade
    }

    data class Person (var firstName: String, var lastName: String)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




       /* //val person1: Person = null
        val person2: Person? = null

        val greeting: String? = "Hello There"

        if (greeting != null) {
            println("Joe Says: $greeting")
        }

        println("greeting length = ${greeting?.length}")

        val len = greeting?.length ?:0
        println("Length = $len")

        val badLen = greeting!!.length

        val safeGuard: String? = greeting as? String
*/
     /*   for (i in 1..10) {
            println("i = $i")
        }

        val students = listOf("abdul","jameel", "jameela", "shakeel", "shakeela")
        for (student in students) {
            println("current student is $student")
        }

        for ((index, student) in students.withIndex()) {
            println("Student #$index + 1 is $student")
        }*/
/*
        val x = 1
        when(x) {
            1 -> println("x == 1")
            2 -> println("x == 2")
            3,4 -> println("x == 3 or 4")
        }

        val card = Suit.Spade
        val y = when(card) {
            Suit.Club, Suit.Spade -> println("Black Card")
            Suit.Diamond, Suit.Heart -> println("Red Card")
        }

        val ageType = when(x) {
            in 0..1 -> "baby"
            in 2..4 -> "toddler"
            in 5..12 -> "kid"
            in 13..19 -> "teenager"
            in 20..64 -> "adult"
            else -> "senior"
        }

        println("You are a $ageType")*/



        /*val bigger = 101
        val smaller = 1
        val max = if (bigger > smaller) bigger else smaller

        if (bigger > 10 ){
            println("Greater than 10.")
        } else if (bigger > 100) {
            println("Greater than 100")
        } else {
            println("Not too big")
        }

        val number = 121
        val bucket: Any = if (number > 100) {
            "alpha"
        } else if (number > 90) {
            println("Less than 90")
            2
        } else if (number > 80) {
            1
        } else {
            0
        }
        println("bucket = $bucket")*/
    }
}