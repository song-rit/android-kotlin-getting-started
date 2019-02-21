package com.awidcha.kotlingettingstarted.learning.`class`

/**
 * Created by song.cpe on 2/20/19.
 */
class Person (name : String){

    var firstProperty = "first property: $name".also(::println)

    init {
        println("first initial block : $firstProperty")
    }

    var secondProperty = "second property: ${name.length}"

    init {
        println("second block: : $secondProperty")
    }

}

class Person2 constructor(name : String) {

    var firstProperty = "first property: $name".also(::println)

    init {
        println("first initial block : $firstProperty")
    }

    var secondProperty = "second property: ${name.length}"

    init {
        println("second block: : $secondProperty")
    }
}

class Person3 {

    constructor() {
        println("constructor")
    }

    constructor(name : String) {
        println("overloading constructor: $name")
    }

    // not constructor
    fun Person3() {
        println("Person3")
    }

    // not constructor
    fun Person3(name : String) {
        println("overloading Person3: $name")
    }

    init {
        println("init")
    }

    init {
        println("init2")
    }
}

class Person4(name : String = "Testing") {

    var myName = name.toUpperCase()

    constructor(name: String, surname: String) : this(name) {
        this.myName = name + surname
    }

    fun displayName() {
        println(myName)
    }

}

