package edu.cuny.citytech.cst.gpa;
//Developer: Usman, Muhammad
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;

public class T1_GPA{
	//---------------Numeric grade inputs---------------//
	@Test
	@DisplayName("A")
	public void tA() {
		//93-100% 	A 	4.0
		GPA.Score scoreResult = GPA.calculateGrade(93);
		String expected = "A";
		String actual = scoreResult.letterGrade();
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("A-")
	public void tA_minus() {
		//90-92.9% 	A- 	3.7
		GPA.Score scoreResult = GPA.calculateGrade(91);
		String expected = "A-";
		String actual = scoreResult.letterGrade();
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("B+")
	public void tB_plus() {
		//87-89.9% 	B+ 	3.3
		GPA.Score scoreResult = GPA.calculateGrade(88);
		String expected = "B+";
		String actual = scoreResult.letterGrade();
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("B")
	public void tB() {
		//83-86.9% 	B 	3.0
		GPA.Score scoreResult = GPA.calculateGrade(84);
		String expected = "B";
		String actual = scoreResult.letterGrade();
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("B-")
	public void tB_minus() {
		//80-82.9% 	B- 	2.7
		GPA.Score scoreResult = GPA.calculateGrade(81);
		String expected = "B-";
		String actual = scoreResult.letterGrade();
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("C+")
	public void tC_plus() {
		//75-76.9% 	C 	2.0
		GPA.Score scoreResult = GPA.calculateGrade(78);
		String expected = "C+";
		String actual = scoreResult.letterGrade();
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("C")
	public void tC() {
		//75-76.9% 	C 	2.0
		GPA.Score scoreResult = GPA.calculateGrade(76);
		String expected = "C";
		String actual = scoreResult.letterGrade();
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("D")
	public void tD() {
		//60-74.9% 	D 	1.0
		GPA.Score scoreResult = GPA.calculateGrade(60);
		String expected = "D";
		String actual = scoreResult.letterGrade();
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("F")
	public void tF() {
		//Below 60 	F 	0.0
		GPA.Score scoreResult = GPA.calculateGrade(59.9F);
		String expected = "F";
		String actual = scoreResult.letterGrade();
		assertEquals(expected, actual);
	}
	//---------------Letter grade inputs---------------//



}//End of class T1_GPA