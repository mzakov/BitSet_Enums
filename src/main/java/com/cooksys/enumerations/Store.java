package com.cooksys.enumerations;

public enum Store {
	
	MEMPHIS(100.0), JACKSON(350.0), NASHVILLE(500.0);
	
	private Double profit;
	
	private Store(double d) {
		profit = d;
	}

	public Double getProfit() {
		return profit;
	}

	public void setProfit(Double profit) {
		this.profit = profit;
	}

}
