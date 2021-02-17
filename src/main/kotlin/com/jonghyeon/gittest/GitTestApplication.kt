package com.jonghyeon.gittest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GitTestApplication

fun main(args: Array<String>) {
    runApplication<GitTestApplication>(*args)
}
