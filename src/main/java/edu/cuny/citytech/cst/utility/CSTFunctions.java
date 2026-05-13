package edu.cuny.citytech.cst.utility;
//Developer: Usman, Muhammad | @AbuTalha63 on GitHub
import java.text.DecimalFormat;
import java.util.function.Function;

public class CSTFunctions {

	
	static private DecimalFormat formatter = new DecimalFormat("#,###.00");
	//static since its only needed once private since its internal code
	
	static public Function<Number, String> money = amount -> {
	//Function is the data type we are defining here, it takes in a Number(Which is the 
		//ancestor to all number types in Java) and gives back a string
	//static once again since we only need one version of it in memory
		
		return formatter.format(amount);//we need string return type and it matches java knows
	};
}
