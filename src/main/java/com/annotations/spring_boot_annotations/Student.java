package com.annotations.spring_boot_annotations;


import lombok.*;
import org.slf4j.LoggerFactory;

import java.util.logging.Logger;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {

    private Logger logger = (Logger) LoggerFactory.getLogger(Student.class);

    String name;



//    public Student() {
//    }

//    public Student(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public void studying(){
        logger.info("I am studying");
        System.out.println(this.name+"am studying");
    }
}
