package com.springboot.thymeleaf;

public class PersonForm {
	 private String firstName;
	    private String lastName;
	 
	    public String getFirstName() {
	        return firstName;
	    }
	 
	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }
	 
	    public PersonForm() {
			super();
			// TODO Auto-generated constructor stub
		}

		public String getLastName() {
	        return lastName;
	    }
	 
	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }

		public PersonForm(String firstName, String lastName) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
		}
	    
}
