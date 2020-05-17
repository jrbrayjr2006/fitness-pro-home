package com.jaydot2.fitness.fitnessprohome.registration

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.SerializationFeature
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder
import org.springframework.web.servlet.LocaleResolver
import org.springframework.web.servlet.i18n.FixedLocaleResolver
import java.util.Locale

class RestTestConfig private constructor() {

    companion object {
        private val LOCALE = Locale.ENGLISH

        fun fixedLocaleResolver(): LocaleResolver {
            return FixedLocaleResolver(LOCALE)
        }

        fun objectMapper(): ObjectMapper {
            return Jackson2ObjectMapperBuilder()
                    .featuresToDisable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
                    .modulesToInstall(
                            Jdk8Module(),
                            JavaTimeModule()
                    )
                    .build()
        }
    }
}