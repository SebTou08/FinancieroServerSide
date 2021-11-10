package com.example.tufinancieroapi;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class TuFinancieroApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(TuFinancieroApiApplication.class, args);
    }

    @Bean
    public ModelMapper modelMapper() {return new ModelMapper();}

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
