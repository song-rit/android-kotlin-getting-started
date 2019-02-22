package com.awidcha.kotlingettingstarted.learning.classinheritance

/**
 * Created by song.cpe on 2/21/19.
 */

open class Base(p : Int) {
    open var myParameter : Int = p.also(::println)

    open fun displayParameter() {
        println(myParameter)
    }

    fun display() {
        println(myParameter)
    }
}

open class Derived(p : Int) : Base(p)

open class Derived2 : Base {

    override var myParameter : Int

    constructor(p : Int) : super(p) {
        this.myParameter = p
    }

    final override fun displayParameter() {
        println("my parameter: ${this.myParameter}")
    }
}

class Derived3 : Derived2 {
    override  var myParameter : Int

    constructor(p : Int) : super(p) {
        this.myParameter = p
    }
}