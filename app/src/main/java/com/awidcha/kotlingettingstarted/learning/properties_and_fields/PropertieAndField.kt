package com.awidcha.kotlingettingstarted.learning.properties_and_fields

/**
 * Created by song.cpe on 2/25/19.
 */

class PropertiesAndField {

}

class Address {
    var name : String = ""
    var street: String = ""

    fun coppyAddress(): Address {
        val address = Address()
        address.name = this.name
        address.street = this.street
        return address
    }
}

