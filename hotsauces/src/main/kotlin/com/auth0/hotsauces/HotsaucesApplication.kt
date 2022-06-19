package com.auth0.hotsauces

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@EnableScheduling
class HotsaucesApplication

fun main(args: Array<String>) {
	runApplication<HotsaucesApplication>(*args)
}
