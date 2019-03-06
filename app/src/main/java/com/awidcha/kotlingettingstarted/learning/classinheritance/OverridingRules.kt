package com.awidcha.kotlingettingstarted.learning.classinheritance

/**
 * Created by song.cpe on 3/6/19.
 */

open class A {
    open fun f() { println("A")}
}

interface B {
    fun f() {println("B")}
}

class C(): A(), B {
    override fun f() {
        super<A>.f()
        super<B>.f()
    }


}