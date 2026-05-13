package edu.cuny.citytech.cst.dto;

public class ETFPoints extends ETF{

	protected float expensesScore;
	protected float dividendScore;
	protected float riskScore;
	protected float liquidityScore;
	
	
	public float getExpensesScore() {
		return expensesScore;
	}
	public void setExpensesScore(float expensesScore) {
		this.expensesScore = expensesScore;
	}
	public float getDividendScore() {
		return dividendScore;
	}
	public void setDividendScore(float dividendScore) {
		this.dividendScore = dividendScore;
	}
	public float getRiskScore() {
		return riskScore;
	}
	public void setRiskScore(float riskScore) {
		this.riskScore = riskScore;
	}
	public float getLiquidityScore() {
		return liquidityScore;
	}
	public void setLiquidityScore(float liquidityScore) {
		this.liquidityScore = liquidityScore;
	}
	
	
	
}
