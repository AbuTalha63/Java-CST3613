package edu.cuny.citytech.cst.service;
import java.util.ArrayList;
//Developer: Usman, Muhammad | @AbuTalha63 on GitHub
import java.util.List;

import edu.cuny.citytech.cst.dto.ETF;
import edu.cuny.citytech.cst.dto.ETFPoints;

public class ETFService {
	
	private List<ETF> list = new ArrayList<>();
	
	public List<ETFPoints> getBestDividendstocks(){
		
		List<ETFPoints> listOfETFPoints = list.stream().map( ETFPoints::new ).toList(); 
		//This function is taking in a values of etf and returning ETFPoints - what we need to get 
		//the corresponding "Grade" values associated with each ETF based on GPACalculator class
		
		return listOfETFPoints;
		
	}
	
	
	
	

}
