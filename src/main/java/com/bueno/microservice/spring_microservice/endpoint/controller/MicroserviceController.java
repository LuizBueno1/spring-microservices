package com.bueno.microservice.spring_microservice.endpoint.controller;

import com.bueno.microservice.spring_microservice.endpoint.service.MicroserviceService;
import com.bueno.microservice.spring_microservice.model.Microservice;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("microservice")
@Slf4j
@RequiredArgsConstructor
public class MicroserviceController {
    private final MicroserviceService microserviceService;

    @GetMapping
    public ResponseEntity<Iterable<Microservice>> listAll(Pageable pageable){
        return new ResponseEntity<>(microserviceService.list(pageable), HttpStatus.OK);
    }

}
