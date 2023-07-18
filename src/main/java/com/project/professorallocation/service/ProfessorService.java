package com.project.professorallocation.service;

import org.springframework.stereotype.Service;

@Service
public class ProfessorService {

	private ProfessorService prof;

	public ProfessorService(ProfessorService prof) {
		this.prof = prof;
	}
}
