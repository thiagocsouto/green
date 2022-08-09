package com.eco.green.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.eco.green.enuns.Sex;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user_green")
@Data
@NoArgsConstructor 
public class User {

	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
    
	@Column(name="name")  
	@Size(min=3, max=50, message="Name must contain at least 3 characters to continue.")
	@Pattern(regexp = "^[A-Z][a-zA-ZáàâãéèêíïóôõöúçñÁÀÂÃÉÈÊÍÏÓÒÖÚÇÑ ]*$", message="The first name must not start with a lowercase letter, number and cannot contain a special character. Just write the first name.")
	private String name;   
	
	@Column(name= "age")
	@NotNull(message="Required field, enter age to continue.")
	@Min(value=13, message="Age should not be less than 12.")
	@Max(value=100, message="Age should not be less than 100.")
	@Pattern(regexp = "\\d+", message="Age invalid, enter only whole numbers.")
	private String age;  
	
	@Column(name= "sex")
	@Enumerated(EnumType.STRING)
	private Sex sex; 
	
	@Column(name= "email")
	@Email(message ="must be a well-formed email address.") 
	@NotBlank(message ="Email must not be blank")
	private String email;
	
	@Column(name= "suggestion") 
	private String suggestion;

	public User(
			@Size(min = 3, max = 50, message = "Name must contain at least 3 characters to continue.") @Pattern(regexp = "^[A-Z][a-zA-ZáàâãéèêíïóôõöúçñÁÀÂÃÉÈÊÍÏÓÒÖÚÇÑ ]*$", message = "The first name must not start with a lowercase letter, number and cannot contain a special character. Just write the first name.") String name,
			@NotNull(message = "Required field, enter age to continue.") @Min(value = 13, message = "Age should not be less than 12.") @Max(value = 100, message = "Age should not be less than 100.") @Pattern(regexp = "\\d+", message = "Age invalid, enter only whole numbers.") String age,
			Sex sex,
			@Email(message = "must be a well-formed email address.") @NotBlank(message = "Email must not be blank") String email,
			String suggestion) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.email = email;
		this.suggestion = suggestion;
	}
	
	

}
