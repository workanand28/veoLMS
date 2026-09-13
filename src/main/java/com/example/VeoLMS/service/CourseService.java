package com.example.VeoLMS.service;
import com.example.VeoLMS.entity.Course;
import com.example.VeoLMS.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CourseService {

    private CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }
}
