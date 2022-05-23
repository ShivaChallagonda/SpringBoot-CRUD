package com.dev.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private long mobile;
	private String country;
	
	public Student(String name, long mobile, String country) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.country = country;
	}
	
	public Student() {
		super();
	}


}
