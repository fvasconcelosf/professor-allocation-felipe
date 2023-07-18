package com.project.professorallocation.service;

import org.springframework.stereotype.Service;

@Service
public class CourseService {

	private CourseService course;
	
	public CourseService (CourseService course) {
		this.course = course;
	}
	
}
