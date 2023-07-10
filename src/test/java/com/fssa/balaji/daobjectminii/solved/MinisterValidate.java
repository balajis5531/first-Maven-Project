package com.fssa.balaji.daobjectminii.solved;

import com.fssa.balaji.dayobject.solved.Minister;
import com.fssa.balaji.dayobject.solved.ProjectObjectValidate;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class MinisterValidate {
	
	private Minister minister;

	@Before 
	public void setUp() {
		minister = new Minister();
		minister.setConstuencyName("villupuram");
		minister.setWinCantidateName("balaji");
		minister.setDistrict("vilupuram");
		minister.setParties("BJP");
		minister.setCantidateVotes(12383);
		minister.setTotalVotesOfConstuency(366236776);
		minister.setExprience(10);
	}

	@Test
	public void testValidateValidMinister() {
		
		boolean result = ProjectObjectValidate.validate(minister);
		Assert.assertTrue(result);
	}

	@Test
	public void testInvalidConstuencyName() {
		minister.setWinCantidateName("Bghg");
		minister.setConstuencyName("");
		IllegalArgumentException exception = Assert.assertThrows(IllegalArgumentException.class,
				() -> ProjectObjectValidate.validate(minister));
		Assert.assertEquals("Constuency name is required", exception.getMessage());
	}

	@Test
	public void testInvalidName() {
		minister.setWinCantidateName("46537");
		IllegalArgumentException exception = Assert.assertThrows(IllegalArgumentException.class,
				() -> ProjectObjectValidate.validate(minister));
		Assert.assertEquals("Minister name is required", exception.getMessage());
	}

	@Test
	public void testInvalidDistrict() {
		minister.setDistrict("&^%^]");
		IllegalArgumentException exception = Assert.assertThrows(IllegalArgumentException.class,
				() -> ProjectObjectValidate.validate(minister));
		Assert.assertEquals("District name is required", exception.getMessage());
	}

	@Test
	public void testInvalidParties() {
		minister.setParties(null);
		IllegalArgumentException exception = Assert.assertThrows(IllegalArgumentException.class,
				() -> ProjectObjectValidate.validate(minister));
		Assert.assertEquals("Parties name is required", exception.getMessage());
	}

	@Test
	public void testInvalidCantidateVotes() {
		minister.setCantidateVotes(0);
		IllegalArgumentException exception = Assert.assertThrows(IllegalArgumentException.class,
				() -> ProjectObjectValidate.validate(minister));
		Assert.assertEquals("Votes is required", exception.getMessage());
	}

	@Test
	public void testInvalidTotalVotes() {
		minister.setTotalVotesOfConstuency(-1);
		IllegalArgumentException exception = Assert.assertThrows(IllegalArgumentException.class,
				() -> ProjectObjectValidate.validate(minister));
		Assert.assertEquals("Total votes is required", exception.getMessage());
	}

	@Test
	public void testInvalidExperience() {
		minister.setExprience(101);
		IllegalArgumentException exception = Assert.assertThrows(IllegalArgumentException.class,
				() -> ProjectObjectValidate.validate(minister));
		Assert.assertEquals("Minister experience should be a positive value", exception.getMessage());
	}
}
