package placetolive;
public class House extends PlaceToLive {
	private double mortgageCost;
	private double taxCost;
	
	public double getMortgageCost() {
		return mortgageCost;
	}
	public void setMortgageCost(double mortgageCost) {
		this.mortgageCost = mortgageCost;
	}
	public double getTaxCost() {
		return taxCost;
	}
	public void setTaxCost(double taxCost) {
		this.taxCost = taxCost;
	}
}
