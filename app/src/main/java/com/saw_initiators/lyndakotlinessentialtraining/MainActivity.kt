package com.saw_initiators.lyndakotlinessentialtraining

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val greeting: String = "Hello There"
        val owe = 50

        val janet = "I owe Janet \$$owe dollars"
        println(janet)

        val infinity = "The infinity symbol is \u221E"
        println(infinity)

        println("[$greeting] is ${greeting.length} characters long")

        var bad = greeting.get(2)
        val  letter = greeting[1]

        val compare1 = "beta"
        val compare2 = "alpha"

        println("${compare1.compareTo(compare2)}")

        val sub = greeting.subSequence(6,9)
        println("sub =  ${sub}")

        for (single in greeting) {
            print("$single ")
        }

        val myString = """
           Kotlin is fun.
            Kotlin in pragmatic.
        """

        println(myString)


       /* var count: Int = 0
        val number: Int = 42

        val otherNumber = 43

        val myLong: Long = 3000000000L
        val myByte: Byte = 127
        val myShort: Short = 32767
        val myDouble: Double = 98.6
        val myFloat: Float = 12.2F
        val alsoDouble = 101.5

        val asInt = alsoDouble.toInt()
        val asFloat = myLong.toFloat()

        val maxInt = 2_147_483_648*/
/*
        val letter: Char = 'A'
        val tab: Char = '\t'
        val infinity: Char = '\u221E'

        println("letter = $letter")
        println("Tabbed $tab over")
        println("infinity $infinity")

        val lineFeed = 10.toChar()
        println("line feed = $lineFeed")

        var willExercise: Boolean = false
        val bigNumber = 1_000_000
        val smallNumber = 2
        println("is bug number bigger = ${bigNumber > smallNumber}")

        println("will exercise = ${!willExercise}")*/
    }
}