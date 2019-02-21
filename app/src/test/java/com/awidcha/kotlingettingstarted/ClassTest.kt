package com.awidcha.kotlingettingstarted

import com.awidcha.kotlingettingstarted.learning.`class`.Person
import com.awidcha.kotlingettingstarted.learning.`class`.Person2
import com.awidcha.kotlingettingstarted.learning.`class`.Person3
import com.awidcha.kotlingettingstarted.learning.`class`.Person4
import org.junit.Before
import org.junit.Test

/**
 * Created by song.cpe on 2/21/19.
 */
class ClassTest {

//    lateinit var myPerson : Person
//
//    @Before
//    fun setup() {
//        myPerson = Person("Hello")
//    }
    @Test
    fun test_Person() {
       Person("Hello")
    }

    @Test
    fun test_Person2() {
        Person2("Jame")
    }

    @Test
    fun test_person3() {
        Person3()
    }

    @Test
    fun test_person4() {
        Person4().displayName()
        Person4("Hello", "World").displayName()
    }
}