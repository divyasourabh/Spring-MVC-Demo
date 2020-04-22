package com.ds.springdemo;

import java.util.LinkedHashMap;

public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
//	private LinkedHashMap<String, String> countryOptions;
	private String favoriteLanguage;
	
//	 private LinkedHashMap<String, String> favoriteLanguageOptions;
	
	private String[] operatingSystems;

	public Student() {
//		COUNTRY CODE MOVE TO PROPERTIES FILE
		
//		countryOptions = new LinkedHashMap<String, String>();
//		countryOptions.put("IN", "India");
//		countryOptions.put("DE", "Germany");
//		countryOptions.put("FR", "Franch");
//		countryOptions.put("USA", "USA");
//		countryOptions.put("BR", "Brazil");
		
		
		  // populate favorite language options
//        favoriteLanguageOptions = new LinkedHashMap<>();

        // parameter order: value, display label
        //
//        favoriteLanguageOptions.put("Java", "Java");
//        favoriteLanguageOptions.put("C#", "C#");
//        favoriteLanguageOptions.put("PHP", "PHP");
//        favoriteLanguageOptions.put("Ruby", "Ruby");     
	}
	
//	public LinkedHashMap<String, String> getCountryOptions() {
//		return countryOptions;
//	}
	
//    public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
//        return favoriteLanguageOptions;
//    }
	
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}
	
	

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
}
