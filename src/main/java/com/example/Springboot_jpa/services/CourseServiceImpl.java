package com.example.Springboot_jpa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Springboot_jpa.dao.CourseDao;
import com.example.Springboot_jpa.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseDao courseDao;

	public CourseServiceImpl() {			
	}
	
	@Override
	public List<Course> getCourses() {
		
		return courseDao.findAll();
	}
	@Override
	public Optional<Course> getCourse(long courseId) {
		return courseDao.findById(courseId);
	}
	@Override
	public Course addCourse(Course course) {
		courseDao.save(course);
		return course;
	}
	
	@Override
	public String deleteCourse(long courseId) {
		courseDao.delete(courseDao.getById(courseId)); 
		return "Course Removed";
	}
	@Override
	public Course updateCourse(Course course) {
		courseDao.save(course);
		return course;
	}


}
