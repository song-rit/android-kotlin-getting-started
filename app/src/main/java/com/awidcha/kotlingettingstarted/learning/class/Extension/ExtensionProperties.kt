package com.awidcha.kotlingettingstarted.learning.`class`.Extension

/**
 * Created by song.cpe on 3/6/19.
 */
class ExtensionProperties {
    val <T> List<T>.lastIndex: Int
    get() = size - 1
}