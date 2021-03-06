package com.auth0.hotsauces

import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class KafkaConsumer {

    @KafkaListener(topics = ["tutorial-topic"])
    fun processMessage(event: TimestampEvent) {
        println("Received: ${event.timestamp.toString()}")
    }

}