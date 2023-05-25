package com.sggnology.customerrorpagetest.view.error

import jakarta.servlet.RequestDispatcher
import jakarta.servlet.http.HttpServletRequest
import org.springframework.boot.web.servlet.error.ErrorController
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/error")
class CustomErrorController: ErrorController {

    @GetMapping("")
    fun errorPage(
        httpServletRequest: HttpServletRequest
    ): String{
        val statusCode = httpServletRequest.getAttribute(RequestDispatcher.ERROR_STATUS_CODE)

        when(statusCode){
            404 -> return "view/error/404"
        }

        return "view/error/500"
    }
}