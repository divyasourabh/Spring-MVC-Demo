package com.ds.springdemo.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MultiCourseCodeConstraintValidator implements ConstraintValidator<MultiCourseCode, String>{

	private String[] multiCourseCodePrefixes; 

	@Override
	public void initialize(MultiCourseCode multiCourseCode) {
		multiCourseCodePrefixes = multiCourseCode.value();
	}

	@Override
	public boolean isValid(String theCode, 
			ConstraintValidatorContext theConstraintValidatorContext) {
		boolean result = false;

		if (theCode != null) {

			//
			// loop thru course prefixes
			//
			// check to see if code matches any of the course prefixes
			//
			for (String tempPrefix : multiCourseCodePrefixes) {
				result = theCode.startsWith(tempPrefix);

				// if we found a match then break out of the loop
				if (result) {
					break;
				}
			}
		}
		else {
			result = true;
		}

		return result;
	}
}
