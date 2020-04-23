package com.ds.springdemo;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	//Add an init binder... to convert trim input strings
//	 remove leading and trailing whitespace resolve issue for our validaton....if all white space then trim to null
	
	@InitBinder
	public void initBinder (WebDataBinder binder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {

		model.addAttribute("customer", new Customer());

		return "customer-form";
	}

	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult) {
		//bindingResult @ModelAttribute Sequence Matters
		
		System.out.println("Binding result: " + bindingResult);

		if(bindingResult.hasErrors()) {
			return "customer-form";
		} else {
			return "customer-confirmation";
		}
	}
}
