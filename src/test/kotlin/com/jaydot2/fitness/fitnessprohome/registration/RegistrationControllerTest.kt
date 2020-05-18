package com.jaydot2.fitness.fitnessprohome.registration

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import org.springframework.test.web.servlet.MvcResult
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
import org.springframework.test.web.servlet.setup.MockMvcBuilders

@Tag("unitTest")
@DisplayName("Registration operations tests")
class RegistrationControllerTest {

    private lateinit var requestBuilder: RegistrationCrudRequestBuilder

    @BeforeEach
    fun setUp() {
        val mockMvc = MockMvcBuilders.standaloneSetup(RestrationController()).build()
        requestBuilder = RegistrationCrudRequestBuilder(mockMvc)
    }

    @Test
    @DisplayName("Given a request, when a registration request is made, then return status Ok")
    fun shouldReturnStatusOk() {
        // Given
        val INPUT = CreateRegistraionDTO()
        val mvcResult: MvcResult
        // When
        mvcResult = requestBuilder.create(INPUT).andExpect(status().isOk).andReturn()
        // Then
    }
}
