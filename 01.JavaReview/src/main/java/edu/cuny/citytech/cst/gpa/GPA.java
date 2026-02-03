package edu.cuny.citytech.cst.gpa;


public class GPA {
	
//	93-100% 	A 	4.0
//	90-92.9% 	A- 	3.7
//	87-89.9% 	B+ 	3.3
//	83-86.9% 	B 	3.0
//	80-82.9% 	B- 	2.7
//	77-79.9% 	C+ 	2.3
//	75-76.9% 	C 	2.0
//	60-74.9% 	D 	1.0
//	Below 60 	F 	0.0
	
	public record Score(float range1, float range2, String letterGrade, float gpa) {}
	
	public static Score calculateGrade(float score) {
		
		return new Score (93, 100, "A", 4.0F);
		
	}

}