package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageController(val service: MessageService) {
    @GetMapping
    fun index() : List<Message> = service.findMessages()

    @PostMapping
    fun post(@RequestBody message: Message) {
        service.save(message)
    }
//    fun index() = listOf(
//        Message("1", "Hello!"),
//        Message("2", "Bonjour!"),
//        Message("3", "Privet!")
//    )
//    fun index(@RequestParam("name") name:String) = "Hello $name!"
}