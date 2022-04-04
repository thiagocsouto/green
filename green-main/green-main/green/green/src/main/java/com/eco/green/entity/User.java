package com.eco.green.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.eco.green.enuns.Sex;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user_green")
@NoArgsConstructor
@AllArgsConstructor
public class User {
	
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
	private Integer id;
    
	@Column(name= "name") 
	@Size(min=3, max=50, message="Name must contain at least 3 characters to continue.")
	private String name;
	
	@Column(name= "age")
	@NotNull(message="Required field, enter age to continue.")
	private Integer age;
	
	@Column(name= "sex")
	@Enumerated(EnumType.STRING)
	private Sex sex;
	
	@Column(name= "email")
	@Size(min=8, max=50, message="The email must contain at least 8 characters to proceed.")
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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
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
