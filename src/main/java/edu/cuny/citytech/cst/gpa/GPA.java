package edu.cuny.citytech.cst.gpa;
//Developer: Usman, Muhammad
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
	
	public record Score (float range1, float range2, String letterGrade, float gpa) {}
	
	public static Score calculateGrade(float gradeInput) {
		
		if (gradeInput >=93 && gradeInput <= 100) 
		{
			return new Score (93, 100, "A", 4.0F);
		}
		
		else if (gradeInput >=90 && gradeInput <=92.9F)
		{
			return new Score (90, 92.9F, "A-", 3.7F);
		}
		
		else if (gradeInput >= 87 && gradeInput <= 89.9F)
		{
			return new Score (87, 89.9F, "B+", 3.3F);
		}
		
		else if (gradeInput >= 83 && gradeInput <=86.9F)
		{
			return new Score (83, 86.9F, "B", 3.0F);
		}
		
		else if (gradeInput >= 80 && gradeInput <= 82.9F)
		{
			return new Score (80, 82.9F, "B-", 2.7F);
		}
		
		else if (gradeInput >= 77 && gradeInput <= 79.9F)
		{
			return new Score (77, 79.9F, "C+", 2.3F);
		}
		
		else if (gradeInput >= 75 && gradeInput <= 76.9F)
		{
			return new Score (75, 76.9F, "C", 2.0F);
		}
		
		else if (gradeInput >= 60 && gradeInput <= 74.9F)
		{
			return new Score (60, 74.9F, "D", 1.0F);
		}
		
		else 
		{
			return new Score(0, 59.9F, "F", 0.0F);
		}
		
		
		
	}//end calculateGrade()
	
}//end class GPA