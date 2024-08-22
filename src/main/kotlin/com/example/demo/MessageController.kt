package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageController {
    @GetMapping
    fun index() = listOf(
        Message("1", "Hello!"),
        Message("2", "Bonjour!"),
        Message("3", "Privet!")
    )
//    fun index(@RequestParam("name") name:String) = "Hello $name!"
}