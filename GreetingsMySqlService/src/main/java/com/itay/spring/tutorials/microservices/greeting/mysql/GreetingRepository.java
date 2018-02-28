package com.itay.spring.tutorials.microservices.greeting.mysql;

import org.springframework.data.repository.CrudRepository;

public interface GreetingRepository extends CrudRepository<Greeting, Integer> {
}
