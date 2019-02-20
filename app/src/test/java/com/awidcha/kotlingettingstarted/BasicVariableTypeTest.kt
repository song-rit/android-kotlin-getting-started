package com.awidcha.kotlingettingstarted

import com.awidcha.kotlingettingstarted.learning.BasicVariableType
import org.junit.Test

/**
 * Created by song.cpe on 2/20/19.
 */
class BasicVariableTypeTest {

    lateinit var myVariable : BasicVariableType

    @Test
    fun test_print() {
        myVariable = BasicVariableType()

//        normal type
        println(myVariable.varInt)
        println(myVariable.varString)
        println(myVariable.varFloat)
        println(myVariable.varDouble)
        println(myVariable.varChar)
        println(myVariable.varBoolean)
        println(myVariable.varByte)
        println(myVariable.varShort)


//        null able type
        println(myVariable.varNullAbleInt)
        println(myVariable.varNullAbleString)
        println(myVariable.varNullAbleDouble)

//        casting int to String
        println(myVariable.varInt.toString())

//        casting int to double
        println(myVariable.varInt.toDouble())

//
    }
}