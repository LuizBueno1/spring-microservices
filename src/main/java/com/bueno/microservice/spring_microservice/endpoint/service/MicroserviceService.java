package com.bueno.microservice.spring_microservice.endpoint.service;

import com.bueno.microservice.spring_microservice.model.Microservice;
import com.bueno.microservice.spring_microservice.repository.MicroserviceRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class MicroserviceService {
    private final MicroserviceRepository microserviceRepository;

    public Iterable<Microservice> list(Pageable pageable){
        log.info("Listing all people");
        return microserviceRepository.findAll(pageable);
    }

}
