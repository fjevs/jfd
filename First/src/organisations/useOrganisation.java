package organisations;
public class useOrganisation {

	public static void main(String[] args) {
		organisation hue = new organisation();
		hue.setName("Obal");
		hue.setProfit(true);
		hue.setRevenue(10000);
		
		hue.display();
		System.out.println(hue.rateInterest());
	}

}
