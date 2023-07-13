package com.project.professorallocation.entity;

import java.sql.Time;
import java.time.DayOfWeek;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Allocation {
	@Override
	public String toString() {
		return "Allocation [id=" + id + ", day=" + day + ", start=" + start + ", end=" + end + ", testeProf="
				+ testeProf + ", testeCour=" + testeCour + "]";
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private DayOfWeek day;
	private Time start;
	private Time end;
	@ManyToOne(optional = false)
	private Professor testeProf;
	@ManyToOne(optional = false)
	private Course testeCour;

	public Professor getTesteProf() {
		return testeProf;
	}

	public void setTesteProf(Professor testeProf) {
		this.testeProf = testeProf;
	}

	public Course getTesteCour() {
		return testeCour;
	}

	public void setTesteCour(Course testeCour) {
		this.testeCour = testeCour;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public DayOfWeek getDay() {
		return day;
	}

	public void setDay(DayOfWeek day) {
		this.day = day;
	}

	public Time getStart() {
		return start;
	}

	public void setStart(Time start) {
		this.start = start;
	}

	public Time getEnd() {
		return end;
	}

	public void setEnd(Time end) {
		this.end = end;
	}

}
