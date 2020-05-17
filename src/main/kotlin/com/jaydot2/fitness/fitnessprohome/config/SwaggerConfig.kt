package com.jaydot2.fitness.fitnessprohome.config

import org.springframework.context.annotation.Configuration
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.service.ApiInfo
import springfox.documentation.service.Contact
import springfox.documentation.service.VendorExtension
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2
import java.util.*

@EnableSwagger2
@Configuration
class SwaggerConfig {

    fun fitnessApi(): Docket {
        return Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo())
    }

    private fun apiInfo(): ApiInfo {
        val contact = Contact("Admin", "www.jaydot2.com", "info@jaydot2.com")
        val vendorExtensions: Collection<VendorExtension<Any>> = Collections.emptyList()
        return ApiInfo("title", "description", "version", "termsOfServiceUrl", contact, "license", "licenseUrl", vendorExtensions)
    }
}