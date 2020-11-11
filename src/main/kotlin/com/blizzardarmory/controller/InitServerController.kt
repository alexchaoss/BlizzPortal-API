package com.blizzardarmory.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class InitServerController() {

    @RequestMapping("init")
    fun init(): String {
        return "Server initialization started"
    }
}