package com.example.Springboot_jpa.services;

import java.util.List;
import java.util.Optional;

import com.example.Springboot_jpa.entities.Course;

public interface CourseService {
	public List<Course> getCourses();
	
	public Optional<Course> getCourse(long courseId);
	
	public Course addCourse(Course course);
	
	public Course updateCourse(Course course);

	public String deleteCourse(long courseId);
	
}
