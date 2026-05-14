package edu.cuny.citytech.cst.dto;

import edu.cuny.citytech.cst.gpa.GPACalculator;
import edu.cuny.citytech.cst.utility.CSTFunctions;

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
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("ETFPoints [etf=");
		builder.append(etf);
		
		builder.append(", rank=");
		builder.append(rank);
		
		builder.append(", symbol=");
		builder.append(symbol);
		
		builder.append(", aum=");
		builder.append( CSTFunctions.money.apply(etf.aum) );
		
		builder.append(", dividends=");
		builder.append(dividends);
		builder.append(": ");
		builder.append( this.getDividendScore() );
		
		builder.append(", liquidity=");
		builder.append(liquidity);
		builder.append(": ");
		builder.append( this.getLiquidityScore() );
		
		builder.append(", risk=");
		builder.append(risk);
		builder.append(": ");
		builder.append( this.getRiskScore() );
		
		builder.append(", expenses=");
		builder.append(expenses);
		builder.append(": ");
		builder.append( this.getExpensesScore() );
		
		builder.append(", yield=");
		builder.append(yield);
		
		builder.append(", frequency=");
		builder.append(frequency);
		
		builder.append("]");
		return builder.toString();
		//code not working??? maybe not going to be used come back if need to be (vid 26)
	}
	


}
