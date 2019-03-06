package com.awidcha.kotlingettingstarted.learning.Delegation

/**
 * Created by song.cpe on 3/6/19.
 */


interface MyBase {
    fun print()
}

class MyBaseImpl(val x: Int): MyBase {
    override fun print() {
        println(x)
    }
}

class UseMyBase(b: MyBase): MyBase by b

