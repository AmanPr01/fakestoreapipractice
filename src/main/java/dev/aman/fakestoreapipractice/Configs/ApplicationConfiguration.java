package dev.aman.fakestoreapipractice.Configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public RestTemplate createRestTemplate() {    // Due to singleton in Spring one object is created during runtime
        return new RestTemplate();
    }
}
