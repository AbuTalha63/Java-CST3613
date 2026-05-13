package edu.cuny.citytech.cst.gpa;
//Developer: Usman, Muhammad | @AbuTalha63

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class GPACalculator {
	
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
	
	static List <Score> scoreTable = Arrays.asList(
			
			new Score(0f, 59.9f, "F", 0.0f),
			new Score(60f, 74.9f, "D", 1.0f),
			new Score(75f, 76.9f, "C", 2.0f),
			new Score(77f, 79.9f, "C+", 2.3f),
			new Score(80f, 82.9f, "B-", 2.7f),
			new Score(83f, 86.9f, "B", 3.0f),
			new Score(87f, 89.9f, "B+", 3.3f),
			new Score(90f, 92.9f, "A-", 3.7f),
			new Score(93f, 100f, "A", 4.0f),
			new Score(100.000f, 104f, "A+", 4.3f)
		);//ArrayList moved out of the method and made static as to not be loaded multiples times every time it is run
	
	public static float getQPA(String letterGrade) {
		Optional<Score> gpa = scoreTable.stream().filter(e -> e.letterGrade.trim().equals(letterGrade)).findFirst();
		if (gpa.isPresent())
			return gpa.get().gpa();
		return 0.01f;
	}
	
	
	public static Score calculateGrade(float score) {
	
		Optional<Score> result = scoreTable.stream()
				  .filter(e -> e.range1() <= score && score <= e.range2())
				  .findFirst();
		
		if (result.isPresent())
			return result.get();
		
		return new Score(0, 0, "?", 0);
	
	}//end of calculateGrade method
	
}//end GPA class










	