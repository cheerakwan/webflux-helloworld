package com.cheerakwan.learning.springbootwebfluxhelloworld.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
public class HomeController {

    @GetMapping("/")
    public Mono<String> helloWorld() {
        log.debug("call hello method");
        return Mono.just("Hello World Webflux");
    }
}
