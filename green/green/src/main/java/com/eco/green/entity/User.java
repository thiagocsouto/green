package com.eco.green.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.eco.green.enuns.Sex;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user_green")
@NoArgsConstructor
@AllArgsConstructor
public class User {
	
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name= "name")
	private String name;
	@Column(name= "age")
	private String age;
	@Column(name= "sex")
	private Sex sex;
	@Column(name= "email")
	private String email;
	@Column(name= "suggestion")
	private String suggestion;
	
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAge() {
		return age;
	}
	
	public void setAge(String age) {
		this.age = age;
	}
	
	public Sex getSex() { 
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSuggestion() {
		return suggestion;
	}
	
	public void setSuggestion(String suggestion) {
		this.suggestion = suggestion;
	}
	
	
	
	
	
	

}
