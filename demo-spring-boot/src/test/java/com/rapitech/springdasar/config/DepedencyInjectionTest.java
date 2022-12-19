package com.rapitech.springdasar.config;

import com.rapitech.springdasar.model.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import static org.junit.jupiter.api.Assertions.*;

class DepedencyInjectionTest {
    private static ApplicationContext context;
    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(DepedencyInjection.class);
    }

    @Test
    void dependencyTest() {
        Foo foo = context.getBean("fooSecond",Foo.class);
        Bar bar = context.getBean(Bar.class);
        FooBar fooBar = context.getBean(FooBar.class);

        Assertions.assertSame(foo, fooBar.getFoo());
        Assertions.assertSame(bar, fooBar.getBar());
    }

    @Test
    void dependencyProductCategory() {
        Product product = context.getBean(Product.class);
        Category category = context.getBean(Category.class);
        ProductCategory productCategory = context.getBean(ProductCategory.class);

        Assertions.assertSame(product, productCategory.getProduct());
        Assertions.assertSame(category, productCategory.getCategory());
    }
}