package com.vmware.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class HelloWorldSpringBoot {
        @Autowired MessageRenderer renderer;

        public static void main(String... args) {
            SpringApplication.run(HelloWorldSpringBoot.class, args);
        }

        @PostConstruct
        public void saysHello(){
                renderer.render();
        }
}