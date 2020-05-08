package com.maddenabbott.iboma;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExampleAutoConfiguration {
    @Bean
    public Example foo(ObjectMapper objectMapper) {
        return new Example(objectMapper);
    }
}
