package com.fssa.balaji.day19.solved;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserValidation {

    @Test
    public void testPositiveId() {// this line start n=method for testvalid id
        User user = new User();  // this is instance object
        user.setId(7);  // this line invoke the value the set id method
        Assertions.assertAll(// this assert all check inside all assersion tru it test case tru athor woise one false this run failure
            () -> Assertions.assertEquals(7, user.getId()),  // this check value
            () -> Assertions.assertNotNull(UserValidator.validate(user))  // this line sen the value to user valid object
        );
    }

    @Test
    public void testCorrectName() {
        User user = new User();
        user.setName("balajis");
        Assertions.assertAll(
            () -> Assertions.assertEquals("balajis", user.getName()),
            () -> Assertions.assertNotNull(UserValidator.validate(user))
        );
    }

    @Test
    public void testPassword() {
        User user = new User();
        user.setPassword("baljis@55");
        Assertions.assertAll(
            () -> Assertions.assertEquals("baljis@55", user.getPassword()),
            () -> Assertions.assertTrue(UserValidator.validate(user))
        );
    }

    @Test
    public void testEmail() {
        User user = new User(); 
        user.setEmail("balajis@gmail.com");
        Assertions.assertAll(
            () -> Assertions.assertEquals("balajis@gmail.com", user.getEmail()),
            () -> Assertions.assertTrue(UserValidator.validate(user))
        );
    }
}

