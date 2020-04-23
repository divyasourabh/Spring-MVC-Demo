package com.ds.springdemo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.ds.springdemo.validation.CourseCode;
import com.ds.springdemo.validation.MultiCourseCode;

public class Customer {

	private String firstName;

	@NotNull(message = "is required")
	@Size(min = 3, message = "Min 3 char required")
	private String lastName;

	@Min(value = 0, message="must be greater than or equal to 1")
	@Max(value = 10, message="must be less than or equal to 10")
	private int freePasses;

	@Pattern(regexp = "^[a-zA-Z0-9]{5}", message ="only 5 chars/digits")
	private String postalCode;


	@MultiCourseCode(value={"IND", "IN"}, message="must start with IND or IN")
	private String courseCode;

//	@CourseCode(value="IND", message="must start with TOPS or LUV")
//	private String courseCode;


	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public int getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(int freePasses) {
		this.freePasses = freePasses;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}


}
