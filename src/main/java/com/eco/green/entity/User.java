package com.eco.green.entity;


import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.eco.green.enuns.Sex;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "user_green")
@ToString @Getter @Setter @AllArgsConstructor @NoArgsConstructor 
@Builder
public class User {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
 
	private String name;   
	
	private String age;  
	
	@Enumerated(EnumType.STRING)
	private Sex sex; 
	
	private String email;
	
	private String suggestion;

}
