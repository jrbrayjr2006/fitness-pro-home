# fitness-pro-home

## Overview

This is a backing service for mobile fitness apps that is written in Kotlin.

### Purpose

This application is designed to facilitate learning of the best practices when building a web application using Kotlin.

## Documentation

Swagger is used to document the APIs in this service.

```kotlin
    @ApiOperation(
            value = "Some Task",
            notes = "Get the tasks"
    )
    @ApiResponses(value = [ApiResponse(code = 200, message = "OK")])
    @GetMapping("/tasks", MediaType.APPLICATION_JSON_VALUE)
    fun task(someDto: SomeDTO): ResponseEntity<Void> {
        return ResponseEntity.ok().build()
    }
```

## Testing
//TODO

## References

- [Kotlin](https://kotlinlang.org/)
- [Writing Unit Tests for a Spring REST API With Kotlin and JUnit 5: Configuration](https://www.petrikainulainen.net/programming/testing/writing-unit-tests-for-a-spring-rest-api-with-kotlin-and-junit-5-configuration/)
