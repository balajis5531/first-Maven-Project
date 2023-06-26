package com.fssa.balaji.day18.solved;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestValidationUtil {
	// Annotation is marker for JUNIT to run this method automatically
	@Test 
	public void testPostiveValidateAge() {
		Assertions.assertTrue(ValidationUtil1.validateAge(9));
	}
	
	@Test
	public void testNegativeValidateAge() {
		try {
			ValidationUtil1.validateAge(-9);
			Assertions.fail("ValidateAge failed");
		}
		catch(IllegalArgumentException ex) {
			Assertions.assertEquals("Invalid age", ex.getMessage());
		}
	}
	

}
