package com.rapitech.springdasar.config;

import com.rapitech.springdasar.model.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

public class DuplicateBeanConfiguration {
    @Primary
    @Bean
//    @Bean(value = "fooFirst")
    public Foo foo1(){
        return new Foo();
    }

//    @Bean(value = "fooSecond")
    @Bean
    public Foo foo2(){
        return new Foo();
    }

}
