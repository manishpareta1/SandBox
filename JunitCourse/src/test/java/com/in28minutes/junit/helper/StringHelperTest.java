package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {
	StringHelper helper = new StringHelper();

	@Test
	public void testTruncateAInFirst2Positions_AInFirst2Position() {
		assertEquals("BC", helper.truncateAInFirst2Positions("AABC"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions_Ain1Position() {
		assertEquals("BC", helper.truncateAInFirst2Positions("ABC"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_NegativeScenario(){
		assertEquals(false, helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_NegativeScenarioWithFalse(){
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_PositiveScenarioWithFalse(){
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}

}
