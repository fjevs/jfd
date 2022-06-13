
public class Account {
	private String name;
	private String address;
	private double balance;
	private String checku;
	
	public String getChecku() {
		return checku;
	}

	public void setChecku(String checku) {
		this.checku = checku;
	}

	public void setName(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAddress(String a) {
		address = a;
	}
	
	public String getAdress() {
		return address;
	}
	
	public void setBalance(double b) {
		balance = b;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void display() {
		System.out.println(name + " " + address + " " + balance);
	}
	
	public double getInterest(double percentageRate) {
		return balance * percentageRate / 100.00;
	}
}
