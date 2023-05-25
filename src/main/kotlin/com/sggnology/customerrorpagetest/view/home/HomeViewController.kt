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
        /**
         * 설명
         * - 500 페이지 재현을 위해 오류를 발생시킨다.
         * */
        throw RuntimeException()
    }
}