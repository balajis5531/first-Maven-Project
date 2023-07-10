package com.fssa.balaji.day19.solved;

import java.util.regex.Pattern;

public class UserValidator {
	public static boolean validate(User obj) throws IllegalArgumentException {  // this line pass the arugument in object

		if (obj.getId() <= 0) {                                                        // this line check condition i value lesthan 0 this trow exeption
			throw new IllegalArgumentException("Invalid id. The id should be positive.");
		}

		if (obj.getName().length() < 2) {                                 // this is line check user name minum length 2 or not
			throw new IllegalArgumentException("Invalid name. The name should have a minimum length of 2.");
		}
 
		if (!passwordValid.validatePassword(obj.getPassword())) {   // this line call for athor folder
			throw new IllegalArgumentException("Invalid password. Password should follow Practice#4 rules.");
		}

		if (!ValidEmail1(obj.getEmail())) {                       // this chek for email validation
			throw new IllegalArgumentException("Invalid email. Please provide a valid email address.");
		}

		return true;   // return value true or false because i declare a method in boolean
	} 

	static boolean ValidEmail1(String email) throws IllegalArgumentException {

		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";

		Boolean isMatch = Pattern.matches(regex, email);

		if (isMatch) {
			System.out.println("The email address is: Valid");
		} else {
			throw new IllegalArgumentException("Invali email please pass correct mail");
		}
		return isMatch;

	}
}

class User {  // class declare
	
	int id;   // variables
	String name;
	String password;
	String email;

	// Getters and setters...

	public int getId() {     // method declare
		return id;
	}

	public void setId(int id) {  //parameter receiving method
		this.id = id;
	}

	public String getName() {    // method declare for name string
		return name;
	}

	public void setName(String name) {   // receving string name value
		this.name = name;
		
	}

	public String getPassword() {   // declare a method string value return
		return password;
	}

	public void setPassword(String password) {  // this line receiving parameter
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}