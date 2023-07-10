package com.fssa.balaji.day19.solved;


/**
 *  this is password validation checking programe
 * */

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class passwordValid{
	
	public static boolean validatePassword(String password) throws IllegalArgumentException { // this line declare a methode
		
		String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=]).{8,}$";  // this is password validation pattern
		
		Pattern pattern = Pattern.compile(regex);     
		
		Matcher matcher = pattern.matcher(password);   // this line check the regex and the given value
		
		if(!matcher.matches()) {
			
			throw new IllegalArgumentException("invalid password give correct value ");
		}
		
		return matcher.matches();  // the return is true or false 
		
	
		
	}
}

//public class PasswordValidator {
//
//
//	public static void main(String[] args) {
//		
//		Scanner scanner= new Scanner(System.in); // this is instance of object
//		
//		System.out.println("Enter your password");  // this line ask for the use 
//		
//		String value= scanner.nextLine();  // this is read for the next line
//		try {
//			boolean success= passwordValid.validatePassword(value);  // this line save for the boolean value same time invoke the value method
//			
//			if(success) {
//				
//				System.out.println("password is : Valid"); // this lines print the value
//			}
//			else {
//				System.out.println("password is : Invalid");
//			}
//			
//			
//		}catch(IllegalArgumentException e) {
//			
//			System.out.println(e.getMessage());
//			
//			e.printStackTrace();
//		}
//		
//		
//	}
//}

