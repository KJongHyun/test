package com.jonghyeon.gittest

import org.springframework.stereotype.Controller

@Controller
class AAA(
    private val common: Common
) {

    fun testMethod() {
        println("333")
    }

}