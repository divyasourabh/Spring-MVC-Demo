package com.ds.springdemo;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/showForm")
	public String showForm (Model theModel) {
		
		Student student = new Student();
		
		theModel.addAttribute("student",student);
		
	    // add the country options to the model 
	    theModel.addAttribute("countryOptions", countryOptions); 
		
		return "student-form";
	}

	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student student) {
		
		System.out.println("Student Name: " + student.getFirstName() + " " + student.getLastName());
		
		return "student-confirmation";
	}
	
	@Value("#{countryOptions}") 
	private Map<String, String> countryOptions;
}
