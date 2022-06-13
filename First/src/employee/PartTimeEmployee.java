package employee;

public class PartTimeEmployee extends employee {
	private double hourlyRate;

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	
	public double findPaymentAmount(int hours) {
		return hourlyRate * hours;
	}
}
