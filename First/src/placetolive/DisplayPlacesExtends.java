package placetolive;

public class DisplayPlacesExtends {

	public static void main(String[] args) {
		House hue = new House();
		hue.setAddress("Beech");
		hue.setNumofbedrooms(4);
		hue.setArea(50);
		hue.setMortgageCost(50);
		hue.setTaxCost(500);
		
		Apartment huefs = new Apartment();
		huefs.setAddress("Hueech");
		huefs.setNumofbedrooms(2);
		huefs.setArea(20);
		huefs.setRentalCost(30);
		
		ApartmentWithFees huefee = new ApartmentWithFees();
		huefee.setAddress("Feeech");
		huefee.setNumofbedrooms(3);
		huefee.setArea(30);
		huefee.setRentalCost(40);
		huefee.setFees(5);
		
		System.out.println("House - Cost per square foot is " + hue.getMortgageCost()/hue.getArea() + " Cost per bedroom is " + hue.getMortgageCost()/hue.getNumofbedrooms());
		System.out.println("Apartment - Cost per square foot is " + huefs.getRentalCost()/huefs.getArea() + " Cost per bedroom is " + huefs.getRentalCost()/huefs.getNumofbedrooms());
		System.out.println("Apartment with fee - Cost per square foot is " + huefee.getRentalCost()/huefee.getArea() + " Cost per bedroom is " + huefee.getRentalCost()/huefee.getNumofbedrooms() + " and fees " + huefee.getFees());
	}

}
