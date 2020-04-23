package com.ds.springdemo.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = MultiCourseCodeConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MultiCourseCode {
	//define default course code
	public String[] value() default {"IND","IN"};
	
	//define default error message
	public String message() default "must start with IND";
	
	//define default groups
	public Class<?>[] groups() default{};
	
	//define default payloads
	public Class<? extends Payload>[] payload() default {};
}
