package com.sggnology.customerrorpagetest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CustomErrorPageTestApplication

fun main(args: Array<String>) {
    runApplication<CustomErrorPageTestApplication>(*args)
}
