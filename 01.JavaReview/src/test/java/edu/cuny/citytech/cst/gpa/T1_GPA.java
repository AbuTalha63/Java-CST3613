package edu.cuny.citytech.cst.gpa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class T1_GPA {
	
	
	
	@Test
	public void t1() {
		GPA.Score score = GPA.calculateGrade(60);
		
		String expected = "D";
		String actual = score.letterGrade();
		
		assertEquals(expected, actual);
	}

}