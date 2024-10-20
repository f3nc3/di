package com.example.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

//Constructor Injection: The GreetingController uses constructor injection to receive an instance of GreetingService. The @Autowired annotation tells Spring to inject the required dependency when creating a GreetingController instance.
