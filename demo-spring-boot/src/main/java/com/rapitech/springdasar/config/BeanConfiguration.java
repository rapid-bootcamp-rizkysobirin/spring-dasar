package com.rapitech.springdasar.config;

import com.rapitech.springdasar.model.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Slf4j
@Configuration

public class BeanConfiguration {
    @Bean
    public Foo foo(){
        Foo foo = new Foo();
        log.info("Created bean foo...!");
        return foo;
    }

}
