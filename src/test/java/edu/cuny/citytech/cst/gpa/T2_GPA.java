package edu.cuny.citytech.cst.gpa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class T2_GPA {	
	
	@DisplayName("Calculate letter grade")
	@ParameterizedTest
	@CsvSource({"59,F,0",
		"61.7,D,1",
		"64.4,D,1",
		"67.1,D,1",
		"69.8,D,1",
		"72.5,D,1",
		"75.2,C,2",
		"77.9,C+,2.3",
		"80.6,B-,2.7",
		"83.3,B,3",
		"86,B,3",
		"88.7,B+,3.3",
		"91.4,A-,3.7",
		"94.1,A,4",
		"96.8,A,4",
		"99.5,A,4"})
	
	void t1(float score, String expected, float gpa ){		
		GPACalculator.Score oScore = GPACalculator.calculateGrade(score);
		String actualValue = oScore.letterGrade(); 
	    assertEquals(expected, actualValue);
	}
	
	
	@DisplayName("Calculate GPA")
	@ParameterizedTest
	@CsvSource({"59,F,0",
		"61.7,D,1",
		"64.4,D,1",
		"67.1,D,1",
		"69.8,D,1",
		"72.5,D,1",
		"75.2,C,2",
		"77.9,C+,2.3",
		"80.6,B-,2.7",
		"83.3,B,3",
		"86,B,3",
		"88.7,B+,3.3",
		"91.4,A-,3.7",
		"94.1,A,4",
		"96.8,A,4",
		"99.5,A,4"})
	
	void t3(float score, String letterGrade, float expected ){		
		GPACalculator.Score oScore = GPACalculator.calculateGrade(score);
		float actualValue = oScore.gpa(); 
	    assertEquals(expected, actualValue);
	}

}