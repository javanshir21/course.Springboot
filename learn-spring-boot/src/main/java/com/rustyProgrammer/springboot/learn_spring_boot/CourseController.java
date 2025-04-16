package com.rustyProgrammer.springboot.learn_spring_boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;
@RestController
public class CourseController {
        @RequestMapping("/courses")
        public List<Course> retriveAllCourse(){
            return Arrays.asList(
                    new Course (1,"Java","Javanshir"),
                    new Course (2 ,"Judo","Javanshir"),
                    new Course (3 ,"C#","Rashad")


            );
        }
    }
