package com.awidcha.kotlingettingstarted.learning

/**
 * Created by song.cpe on 3/6/19.
 */

data class User(val name: String, val age: Int) {}
class DataClassesAndDestructuringDeclarations {
    val jack = User(name = "Jack", age = 1)

    constructor()
    {
        val (name, age) = jack
        println(name)
        println(age)
    }

}