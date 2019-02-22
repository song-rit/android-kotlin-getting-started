package com.awidcha.kotlingettingstarted.learning.classinheritance

/**
 * Created by song.cpe on 2/21/19.
 */
interface IFoo {
    var count: Int
}

open class Foo {
    open var count: Int = 1

    open fun display() {
        println("Hello in Foo")
    }
}

class Boo(override var count: Int) : IFoo {}