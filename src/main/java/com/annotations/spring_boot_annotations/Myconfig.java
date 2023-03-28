package com.annotations.spring_boot_annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import java.util.Date;

@Configuration
@ComponentScan(basePackages = {"mypack"})
public class Myconfig {
    @Bean("student1")
    @Lazy

    public Student getStudent()
    {
        System.out.println("Creating first student object");
        return new Student("Student1");
    }
    @Bean("student2")
    public Student createStudent()
    {
        System.out.println("creating second student object");
        return new Student("Student2");
    }
    @Bean
    public Date getDate(){
        System.out.println("Creating new date");
        return new Date();
    }
}
