package com.jaydot2.fitness.fitnessprohome.registration

import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import io.swagger.annotations.ApiResponse
import io.swagger.annotations.ApiResponses
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Api("fitnessApi")
@RequestMapping("/api")
@RestController
class RestrationController {

    @ApiOperation(
            value = "Register Athlete",
            notes = "Register a new athlete and their mobile app"
    )
    @ApiResponses(value = [ApiResponse(code = 200, message = "OK, registered athlete")])
    @PostMapping("/registrations", MediaType.APPLICATION_JSON_VALUE)
    fun register(registration: CreateRegistraionDTO): ResponseEntity<Void> {
        return ResponseEntity.ok().build()
    }
}