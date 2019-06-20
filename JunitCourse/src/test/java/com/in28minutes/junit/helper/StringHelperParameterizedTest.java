package com.in28minutes.junit.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {
	StringHelper helper = new StringHelper();
	
	private String input;
	private String expectedOutput;
	
	public StringHelperParameterizedTest(String input,String output){
		this.input = input;
		this.expectedOutput = output;
	}
	
	@Parameters
	public static Collection<String[]>testConditions(){
		
		String[][] expectedOutput = {{"AACD","CD"},{"ACD","CD"}};
		
		return Arrays.asList(expectedOutput);
		
	}

	@Test
	public void testTruncateAInFirst2Positions_AInFirst2Position() {
		assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));
	}
	
	@Test
	public void testTruncateAInFirst2Positions_Ain1Position() {
		assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_NegativeScenario(){
		assertEquals(false, helper.areFirstAndLastTwoCharactersTheSame(input));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_NegativeScenarioWithFalse(){
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame(input));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_PositiveScenarioWithFalse(){
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}

}
