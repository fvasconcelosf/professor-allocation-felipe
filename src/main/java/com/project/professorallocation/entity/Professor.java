package com.project.professorallocation.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Professor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; // chave primaria
	@Column(unique = true, nullable = false, length = 11) // com 11 digitos
	private String cpf;
	private String name;
	@JoinColumn(nullable = false)
	@ManyToOne(optional = false)
	private Department departamento;
	
	public Department getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Department departamento) {
		this.departamento = departamento;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Professor [id=" + id + ", cpf=" + cpf + ", name=" + name + ", departamento=" + departamento + "]";
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
