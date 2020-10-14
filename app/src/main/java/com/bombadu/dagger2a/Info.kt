package com.bombadu.dagger2a

import javax.inject.Inject


class Info @Inject constructor(){
    val text = "Hello Dagger 2"
    val description = "This is how we do it"

    fun myAdd(num: Int): Int {
        return num * 2
    }
}

