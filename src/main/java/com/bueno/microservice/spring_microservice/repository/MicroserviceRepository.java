package com.bueno.microservice.spring_microservice.repository;

import com.bueno.microservice.spring_microservice.model.Microservice;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface MicroserviceRepository extends PagingAndSortingRepository<Microservice, Long> {

}
