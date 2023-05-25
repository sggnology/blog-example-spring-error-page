package com.sggnology.customerrorpagetest.view.home

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.client.HttpServerErrorException.InternalServerError

@Controller
@RequestMapping("")
class HomeViewController {

    @GetMapping("/")
    fun home(): String{
        return "view/home/index"
    }

    @GetMapping("/homeError")
    fun homeError(): String{
        throw RuntimeException("Error")
    }
}