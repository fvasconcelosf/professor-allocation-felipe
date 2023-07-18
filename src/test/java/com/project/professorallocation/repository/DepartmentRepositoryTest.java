package com.project.professorallocation.repository;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.TestPropertySource;

import com.project.professorallocation.entity.Department;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
@TestPropertySource(locations = "classpath:application.properties")
public class DepartmentRepositoryTest {

	@Autowired
	DepartmentRepository departmentRepository;

	@Test
	void findAll() { // Achar tudo que tem em departamento
		List<Department> departamentos = departmentRepository.findAll();
		System.out.println(departamentos);
	}

	@Test
	void findById() { // achar pelo ID
		Long id = 4l;
		Optional<Department> testeFindByIdDepartment = departmentRepository.findById(id);
		Department dpt = testeFindByIdDepartment.orElse(null);
		System.out.println(dpt);
	}

	@Test
	void create() { // Cria um novo departamento
		Department dpt1 = new Department();
		dpt1.setName("Psicologia");
		dpt1.setId(null);
		Department dpt2 = departmentRepository.save(dpt1);
		System.out.println(dpt2);
	}

	@Test
	void update() { // atualizar
		Department dpt1 = new Department();
		dpt1.setName("Psicologia 2");
		dpt1.setId(2l);
		Department dpt2 = departmentRepository.save(dpt1);
		System.out.println(dpt2);

	}

	@Test
	void deletById() { // deletar uma id
		Long id = 4l;
		departmentRepository.deleteById(id);
	}

	@Test
	void deletAll() { // deletar tudo
		departmentRepository.deleteAllInBatch();

	}
}
