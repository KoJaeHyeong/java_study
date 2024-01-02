package com.example.java_start.controller;

import com.example.java_start.practice.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PracController {
    @GetMapping("/home")
    public Course getCourses() {
        Course course = new Course("이것은 제목", "재형", 20);
        System.out.println("현재 API 실행");
        return course;
    }
}
