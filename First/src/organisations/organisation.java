package organisations;

public class organisation {
	private String name;
	private double revenue;
	private boolean profit;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRevenue() {
		return revenue;
	}

	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}

	public boolean isProfit() {
		return profit;
	}

	public void setProfit(boolean profit) {
		this.profit = profit;
	}

	public void display() {
		System.out.println(name + " " + revenue + " " + profit);
	}
	
	public double rateInterest () {
		if (profit == true) {
			return revenue / 10;
		} else {
			return revenue / 2;
		}
	}
}
