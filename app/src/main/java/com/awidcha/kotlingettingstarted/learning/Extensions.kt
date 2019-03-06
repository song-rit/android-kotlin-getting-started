package com.awidcha.kotlingettingstarted.learning

/**
 * Created by song.cpe on 3/6/19.
 */
open class C

class D: C()

fun C.foo() = "c"

fun D.foo() = "d"

fun printFoo(c: C) {
    println(c.foo())
}

