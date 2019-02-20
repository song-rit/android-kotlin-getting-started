package com.awidcha.kotlingettingstarted

import com.awidcha.kotlingettingstarted.learning.Collection
import org.junit.Before
import org.junit.Test

/**
 * Created by song.cpe on 2/20/19.
 */
class CollectionTest {

    lateinit var myCollection : Collection
//    var myCollection2 : Collection? = null

    @Before
    fun setup() {
        myCollection = Collection()
    }

    @Test
    fun test_list() {
        myCollection.num.add(4)
        println(myCollection.num)
        println(myCollection.num2)
    }

    @Test
    fun test_sumIndexArray() {
        var sum = myCollection.num[0] + myCollection.num[1]
        println(sum)
    }

    @Test
    fun test_sumAllIndexByForInLoop() {
        var sum : Int = 0

        for(i in myCollection.num) {
            sum += i
        }

        println(sum)
    }

    @Test
    fun test_sumAllIndexByForNormalLoop() {
        var sum : Int = 0

        for(i : Int in myCollection.num.indices) {
            sum += myCollection.num[i]
//            print(i)
//            print(" ")
        }

        println(sum)
    }

    @Test
    fun test_printArrayIndexAndValue() {
        for((index, value) in myCollection.num.withIndex()){
            println("index: $index value: $value")
        }
    }

    @Test
    fun test_printArrayWithWhileLoop() {
        var maxIndexRange : IntRange = myCollection.num.indices
        var maxIndex : Int = myCollection.num.size

        while(maxIndex > 0) {
            println(myCollection.num[maxIndex - 1])
            maxIndex -= 1
        }
    }
}