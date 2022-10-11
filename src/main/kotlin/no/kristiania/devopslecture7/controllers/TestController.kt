package no.kristiania.devopslecture7.controllers

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {

    @GetMapping("/")
    fun sampleEndpoint(): ResponseEntity<String> {
        return ResponseEntity.ok("Hey")
    }

}