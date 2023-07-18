package com.project.professorallocation.service;

import org.springframework.stereotype.Service;

import com.project.professorallocation.repository.DepartmentRepository;

@Service
public class DepartmentService {

	private DepartmentRepository repo;

	public DepartmentService(DepartmentRepository repo) {
		this.repo = repo;
	}
}
