package com.awidcha.kotlingettingstarted.learning.classinheritance

/**
 * Created by song.cpe on 2/22/19.
 */
class MyOutside: Foo() {

    override var count = 10

    override fun display() {
        println("Hello in MyOutside")
    }

    fun display2() {
        println("Display2 in MyOutside")
    }

    inner class MyInnerClass {
        fun display() {
            // display in Foo
            super@MyOutside.display()
            println(super@MyOutside.count)

            // display in MyOutside
            super@MyOutside.display()
            println(super@MyOutside.count)

        }

        fun display2() {
            println("Display2 in MyInnerClass")
        }
    }
}