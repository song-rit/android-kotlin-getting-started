package com.awidcha.kotlingettingstarted

import com.awidcha.kotlingettingstarted.learning.classinheritance.*
import org.junit.Test

/**
 * Created by song.cpe on 2/21/19.
 */
class ClassInheritanceTest {

    @Test
    fun test_Derived() {
        var myDerived : Derived = Derived(10)
        myDerived.display()
        myDerived.displayParameter()
    }

    @Test
    fun test_Derived2() {
        Derived2(1).display()
        Derived2(2).displayParameter()
    }

    @Test
    fun test_MyInheritance() {
      //  var myBase : MyBase = MyBase("hello")
        var myDerived : MyDerived = MyDerived("hello", "world")
    }

    @Test
    fun test_MyInheritance2() {
//        var myBase : MyBase = MyBase("hello")
//        myBase.displayNumber()

        var myDerived : MyDerived = MyDerived("hello", "world")
        myDerived.displayNumber()
    }


    @Test
    fun test_MyInheritanceInnerClass() {
        var myOut : MyOutside = MyOutside()
        var myInner = myOut.MyInnerClass()

        myInner.display()
    }
}