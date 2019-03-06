package com.awidcha.kotlingettingstarted.learning.properties_and_fields

/**
 * Created by song.cpe on 2/25/19.
 */

class PropertiesAndField {

}

class Address {
    var name : String = ""
    lateinit var surname: String
    var street: String = ""

//    init {
//        surname = "Hello"
//    }

    fun coppyAddress(): Address {
        val address = Address()
        address.name = this.name
        address.street = this.street
        return address
    }
}

class MyProperties {

    var addrr: Address? = null
    var setterWithAnnotation: Any? = null
//    @Inject set

   init {
       setterWithAnnotation = 10
       setterWithAnnotation = ""
       setterWithAnnotation = Address()
   }

//    fun hello() {
//        addrr!!::surname.isInitialized
//    }

    // backing field
    var counter = 0
    get() = field
    set(value) {field = value}

    var name: String = ""
        get() {
            if (field == "") {
                return "Hello World"
            }
            return field
        }
        set(value) { field = value}

    companion object {
        const val My_CONSTANCE = ""
    }
}





