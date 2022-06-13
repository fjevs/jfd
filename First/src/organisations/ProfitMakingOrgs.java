package organisations;

public class ProfitMakingOrgs extends Organization_2 {
	
	public double getTax() {
		return getRevenue()/2;
	}
}
