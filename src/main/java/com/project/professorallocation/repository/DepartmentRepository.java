package com.project.professorallocation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.professorallocation.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {

//select * FROM department WHERE name like "%?1%"

List<Department> findByNameContaining (String name); 
	
}