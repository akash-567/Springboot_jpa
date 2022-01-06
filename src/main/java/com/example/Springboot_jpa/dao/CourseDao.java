package com.example.Springboot_jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Springboot_jpa.entities.Course;

@Repository
public interface CourseDao extends JpaRepository<Course, Long> {
	
}
