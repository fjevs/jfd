package organisations;

public class DisplayOrgsSub {

	public static void main(String[] args) {
		ProfitMakingOrgs hueprof = new ProfitMakingOrgs();
		hueprof.setName("Dongifock");
		hueprof.setRevenue(50);
		System.out.println(hueprof.getName() + " " + hueprof.getRevenue() + " " + hueprof.getTax());
		
		
		NonProfitMakingOrgz huenon = new NonProfitMakingOrgz();
		huenon.setName("Fockdongif");
		huenon.setRevenue(50);
		System.out.println(huenon.getName() + " " + huenon.getRevenue() + " " + huenon.getTax());
	}

}
