package com.luv2code.springdemo.mvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
	// Define the attributes for the annotation
	public String value() default "LUV";
	public String message() default "must start with LUV";
	
	// Define default groups (can be used to group constraints)
	public Class<?>[] groups() default {};
	
	// Define default payloads (custom details about the validation failure (severity level, error code et.c))
	public Class<? extends Payload>[] payload() default {};
}
