package com.awidcha.kotlingettingstarted.learning.classinheritance

/**
 * Created by song.cpe on 3/6/19.
 */

open class BaseVehicle {
    open fun f() {}
}

abstract class BaseBoat: BaseVehicle() {
    override abstract fun f()
    abstract fun b()
    fun c() {}
}

class BoatA: BaseBoat() {
    override fun f() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun b() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}