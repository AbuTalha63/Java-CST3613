package edu.cuny.citytech.cst.dto;
//Developer: Usman, Muhammad | @AbuTalha63 on GitHub
import java.util.Date;

import com.learning.java.data.annotation.Column;

import edu.cuny.citytech.cst.utility.CSTFunctions;

public class ETF {
	@Column(index = "0")  protected int rank;
	@Column(index = "1")  protected String symbol;
	@Column(index = "2")  protected String fundName;
	@Column(index = "3")  protected float quantRating;
	@Column(index = "4")  protected float aum;
	@Column(index = "5")  protected String momentum;
	@Column(index = "6")  protected String expenses;
	@Column(index = "7")  protected String dividends;
	@Column(index = "8")  protected String risk;
	@Column(index = "9")  protected String liquidity;
	@Column(index = "10") protected Date payoutDate;
	@Column(index = "11") protected float yield;
	@Column(index = "12") protected String frequency;
	public int getRank() {
		return rank;
	}
	public String getSymbol() {
		return symbol;
	}
	public String getFundName() {
		return fundName;
	}
	public float getQuantRating() {
		return quantRating;
	}
	public float getAum() {
		return aum;
	}
	public float getAumInBillions() {
		return aum / 1_000_000_000; 
	}
	public String getMomentum() {
		return momentum;
	}
	public String getExpenses() {
		return expenses;
	}
	public String getDividends() {
		return dividends;
	}
	public String getRisk() {
		return risk;
	}
	public String getLiquidity() {
		return liquidity;
	}
	public Date getPayoutDate() {
		return payoutDate;
	}
	public float getYield() {
		return yield;
	}
	public String getFrequency() {
		return frequency;
	}
	
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ETF [rank=");
		builder.append(rank);
		builder.append(", symbol=");
		builder.append(symbol);
		builder.append(", aum=");
		builder.append(CSTFunctions.money.apply(aum));
		builder.append(", dividends=");
		builder.append(dividends);
		builder.append(", payoutDate=");
		builder.append(payoutDate);
		builder.append(", yield=");
		builder.append(yield);
		builder.append(", frequency=");
		builder.append(frequency);
		builder.append("]");
		return builder.toString();
	}	
	
	
	
}



























