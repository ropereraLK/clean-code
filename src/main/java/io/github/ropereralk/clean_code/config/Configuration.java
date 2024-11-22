package io.github.ropereralk.clean_code.config;

import io.github.ropereralk.clean_code.di.Communicator;
import io.github.ropereralk.clean_code.di.EmailServiceImpl;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
public class Configuration {

    @Bean
    public Communicator getCommunicator() {
        return new EmailServiceImpl();
    }
}
