package com.jaydot2.fitness.fitnessprohome.registration

import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.ResultActions
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get

class RegistrationCrudRequestBuilder(private val mockMvc: MockMvc) {

    private val objectMapper = RestTestConfig.objectMapper()

    fun create(input: CreateRegistraionDTO): ResultActions {
        return mockMvc.perform(post("/api/registrations")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsBytes(input)))
    }

    fun findById(): ResultActions {
        return mockMvc.perform(get("/api/registrations"))
    }
}