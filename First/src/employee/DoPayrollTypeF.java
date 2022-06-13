package employee;

public class DoPayrollTypeF {

	public static void main(String[] args) {
		FullTimeEmployee ftEmployee = new FullTimeEmployee();
		
		ftEmployee.setName("Barry");
		ftEmployee.setJobTitle("CEO");
		ftEmployee.setWeeklySalary(5000.00);
		ftEmployee.setBenefitDeduction(500.00);
		ftEmployee.cutCheck(ftEmployee.findPaymentAmount());
		System.out.println();
		
		PartTimeEmployee ptEmployee = new PartTimeEmployee();
		
		ptEmployee.setName("Steve");
		ptEmployee.setJobTitle("Driver");
		ptEmployee.setHourlyRate(7.53);
		ptEmployee.cutCheck(ptEmployee.findPaymentAmount(40));
		System.out.println();
		
		PartTimeWithOver ptoEmployee = new PartTimeWithOver();
		ptoEmployee.setName("Huefs");
		ptoEmployee.setJobTitle("Ueba");
		ptoEmployee.setHourlyRate(7.53);
		ptoEmployee.cutCheck(ptoEmployee.findPaymentAmount(41));
	}

}
