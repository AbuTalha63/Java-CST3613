package edu.cuny.citytech.cst.dto;
//Developer: Usman, Muhammad | @AbuTalha63 on GitHub

import static edu.cuny.citytech.cst.gpa.StocksLetterGrade.*;

public class ETFPoints extends ETF{

	private ETF etf;
	
	public ETFPoints(ETF etf) {
		this.etf = etf;
		
	}
	
	//This will convert the values into a grade using the GPACalculator code
	public float getExpensesScore() {
		return getQPA(etf.expenses);
	}
	public float getDividendScore() {
		return getQPA(etf.dividends);
	}
	public float getRiskScore() {
		return getQPA(etf.risk);
	}
	public float getLiquidityScore() {
		return getQPA(etf.liquidity);
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("ETF [rank=");
		builder.append(etf.rank);
		
		builder.append(", symbol=");
		builder.append(etf.symbol);
		
		builder.append(", aum=");
		builder.append(etf.aum);
		
		builder.append(", dividends=");
		builder.append(etf.dividends);
		builder.append(": ");
		builder.append( this.getDividendScore() );
		
		builder.append(", liquidity=");
		builder.append(etf.liquidity);
		builder.append(": ");
		builder.append( this.getLiquidityScore() );
		
		builder.append(", risk=");
		builder.append(etf.risk);
		builder.append(": ");
		builder.append( this.getRiskScore() );
		
		builder.append(", expenses=");
		builder.append(etf.expenses);
		builder.append(": ");
		builder.append( this.getExpensesScore() );
		
		builder.append(", yield=");
		builder.append(etf.yield);
		
		builder.append(", frequency=");
		builder.append(etf.frequency);
		
		builder.append("]");
		return builder.toString();

	}
	


}
