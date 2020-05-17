package com.jaydot2.fitness.fitnessprohome.registration

import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/api")
@RestController
class RestrationController {

    @PostMapping("/registrations", MediaType.APPLICATION_JSON_VALUE)
    fun register(registration: CreateRegistraionDTO): ResponseEntity<Void> {
        return ResponseEntity.ok().build()
    }
}