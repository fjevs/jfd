public class useAccount {

	public static void main(String[] args) {
		Account myAcc = new Account();
		myAcc.setName("Hue");
		myAcc.setBalance(228.00);
		double myInt = myAcc.getInterest(5);
		myAcc.setAddress("foooo");

		myAcc.display();
		System.out.printf("$%5.1f\n", myInt);
		//System.out.println(myAcc.getInterest(5));
		System.out.println(myAcc.getName() + " " + myAcc.getBalance() + " " + myAcc.getAdress());
		
		myAcc.setBalance(myAcc.getBalance() + 1);
		System.out.println(myAcc.getBalance());
	}

}
