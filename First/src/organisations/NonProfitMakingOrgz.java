package organisations;

public class NonProfitMakingOrgz extends Organization_2 {
	
	public double getTax() {
		return getRevenue()/10;
	}
}