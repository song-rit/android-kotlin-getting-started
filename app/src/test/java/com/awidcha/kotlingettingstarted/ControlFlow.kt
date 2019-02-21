package com.awidcha.kotlingettingstarted

import org.junit.Test

/**
 * Created by song.cpe on 2/20/19.
 */
class ControlFlow {

    var num1 : Int = 10
    var num2 : Int = 20
    var max : Int? = null
    var min : Int? = null

    var str1 : String = "A"
    var str2 : String = "B"

    @Test
    fun test_max_min_normal_expression() {
        if(num1 > num2) {
            max = num1
            min = num2
        } else {
            max = num2
            min = num1
        }

        println("max : $max, min : $min")
    }

    @Test
    fun test_max_block_expression() {

        max = if( num1 > num2) {
            num1
        } else {
            num2
        }

        println(max!!)
    }

    @Test
    fun test_max_short_expression() {

        max = if(num1 > num2) num1 else num2
        println(max!!)
    }

    @Test
    fun test_when_expression() {

        str1 = str2

        when(str1.equals(str2)) {
            true -> println("equal")
            false -> println("not equal")
            else -> {
                println("failed")
            }
        }
    }


}