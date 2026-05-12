package edu.cuny.citytech.cst.dto;
//Developer: Usman, Muhammad | @AbuTalha63 on GitHub
import java.util.Date;

import com.learning.java.data.annotation.Column;

public class ETF {
	@Column(index = "0")  private int rank;
	@Column(index = "1")  private String symbol;
	@Column(index = "2")  private String fundName;
	@Column(index = "3")  private float quantRating;
	@Column(index = "4")  private float aum;
	@Column(index = "5")  private String momentum;
	@Column(index = "6")  private String expenses;
	@Column(index = "7")  private String dividends;
	@Column(index = "8")  private String risk;
	@Column(index = "9")  private String liquidity;
	@Column(index = "10") private Date payoutDate;
	@Column(index = "11") private float yield;
	@Column(index = "12") private String frequency;
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
		return "ETF [rank=" + rank + ", symbol=" + symbol + ", aum=" + aum + ", dividends=" + dividends
				+ ", payoutDate=" + payoutDate + ", yield=" + yield + ", frequency=" + frequency + "]";
	}	
	
	
}



























