package com.example.tufinancieroapi.configuration;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfiguration {
    @Bean(name ="iLanguageOpenApi")
    public OpenAPI iLanguageOpenApi(){
        return new OpenAPI()
                .components(new Components())
                .info(new Info()
                        .title("Ilanguage Aplication api")
                        .description("ILanguage API implemmented with Spring Boot RESTful com.example.tufinancieroapi.service and docummented using springdoc-openapi-ui 3.0"));

    }
}