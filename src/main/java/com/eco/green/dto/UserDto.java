package com.eco.green.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import com.eco.green.enuns.Sex;

import lombok.Builder;

@Builder
public record UserDto(
		
        @Positive
		Integer id,

		@Size(min=3, max=50, message="Name must contain at least 3 characters to continue.")
		@Pattern(regexp = "^[a-zA-ZáàâãéèêíïóôõöúçñÁÀÂÃÉÈÊÍÏÓÒÖÚÇÑ ]*$", message="The first name must not start with a lowercase letter, number and cannot contain a special character. Just write the first name.")
		String name,   
		
		@Min(value=13, message="Age should not be less than 12.")
		@Max(value=100, message="Age should not be less than 100.")
		@Pattern(regexp = "\\d+", message="Age invalid, enter only whole numbers.")
		String age,      

		Sex sex,
		
		@Email(message ="must be a well-formed email address.") 
		String email,

		String suggestion

) {}
