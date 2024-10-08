package com.fsd2425.autowiring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AutowiringDemo {

    public static void main(String[] args) {
        ConfigurableApplicationContext cn = SpringApplication.run(AutowiringDemo.class, args);

        student s1 = cn.getBean(student.class);
        System.out.println("Hello");
        System.out.println(s1);
        System.out.println(s1.hashCode());

        student s2 = cn.getBean(student.class);
        System.out.println("Hello");
        System.out.println(s2);
        System.out.println(s2.hashCode());
    }
}
