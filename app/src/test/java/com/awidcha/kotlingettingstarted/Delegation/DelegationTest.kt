package com.awidcha.kotlingettingstarted.Delegation

import com.awidcha.kotlingettingstarted.learning.Delegation.MyBase
import com.awidcha.kotlingettingstarted.learning.Delegation.MyBaseImpl
import com.awidcha.kotlingettingstarted.learning.Delegation.UseMyBase
import org.junit.Test

/**
 * Created by song.cpe on 3/6/19.
 */

class DelegationTest{

    @Test
    fun delegate_test1() {
        var b = MyBaseImpl(10)
        UseMyBase(b).print()

        var ub = UseMyBase(b)
        ub.print()

    }

}