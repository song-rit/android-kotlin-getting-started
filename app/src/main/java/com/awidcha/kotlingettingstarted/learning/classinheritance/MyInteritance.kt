package com.awidcha.kotlingettingstarted.learning.classinheritance

/**
 * Created by song.cpe on 2/22/19.
 */
open class MyBase(var name : String) {

    init {
        println("Initial in MyBase")
    }

    open val length : Int = name.length.also { println("Initial size in MyBase: $it") }

    val number : Int get() = 1
    var number2 : Int = 2

    open fun displayNumber() {
        println("(MyBase)Number : ${this.number}")
    }
}

class MyDerived(name : String, surname: String) : MyBase(name.capitalize().also { println("Argument for MyBase: $it") }) {

    init {
        println("Initial in MyDerived")
    }
    override val length : Int = (super.length + surname.length).also { println("Initial size in Derived: $it" )}

    override fun displayNumber() {
        super.displayNumber()

        println("(MyDerived)Sum ${super.number} + ${super.number2} : ${super.number + super.number2}")

    }

//    val myName = name.also(::print)
//    var mySurname = surname.also(::print)

}
