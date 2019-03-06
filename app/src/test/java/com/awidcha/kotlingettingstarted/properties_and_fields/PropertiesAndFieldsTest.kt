package com.awidcha.kotlingettingstarted.properties_and_fields

import com.awidcha.kotlingettingstarted.learning.properties_and_fields.Address
import org.junit.Test

/**
 * Created by song.cpe on 3/6/19.
 */
class PropertiesAndFieldsTest {

    @Test
    fun getter_setter_test() {
        var addrr: Address = Address()
        addrr.street = "ลาดยาง"
        addrr.name = "55"

        var address2: Address = addrr.coppyAddress()
        println(address2.name)
        println(address2.street)
    }
}
