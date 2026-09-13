package com.example.VeoLMS.repository;

import org.springframework.stereotype.Repository;
import com.example.VeoLMS.entity.Course;
import java.util.List;

@Repository
public class CourseRepository {

    public List<Course> findAll() {
        return List.of(
                new Course(1L, "Java Backend Engineering"),
                new Course(2L, "Spring Boot Masterclass"),
                new Course(3L, "PostgreSQL Fundamentals")
        );
    }
}
