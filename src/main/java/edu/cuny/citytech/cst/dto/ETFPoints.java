package edu.cuny.citytech.cst.dto;

import edu.cuny.citytech.cst.gpa.GPACalculator;

//Developer: Usman, Muhammad | @AbuTalha63 on GitHub

public class ETFPoints extends ETF{

	private ETF etf;
	
	public ETFPoints(ETF etf) {
		this.etf = etf;
		
	}
	
	//This will convert the values into a grade using the GPA code
	public float getExpensesScore() {
		return GPACalculator.getQPA(etf.expenses);
	}
	public float getDividendScore() {
		return GPACalculator.getQPA(etf.dividends);
	}
	public float getRiskScore() {
		return GPACalculator.getQPA(etf.risk);
	}
	public float getLiquidityScore() {
		return GPACalculator.getQPA(etf.liquidity);
	}
		
}
