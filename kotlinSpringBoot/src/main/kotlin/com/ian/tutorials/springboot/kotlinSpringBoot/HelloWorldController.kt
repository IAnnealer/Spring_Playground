package com.ian.tutorials.springboot.kotlinSpringBoot

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/hello")
class HelloWorldController {

    @GetMapping("/springboot")
    fun helloWorld(): String {
        return "Hello, this is a REST EndPoint"
    }
}