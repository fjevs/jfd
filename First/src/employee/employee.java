package employee;
import static java.lang.System.out;

public class employee {
	private String name;
	private String jobTitle;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	public void cutCheck(double amountPaid) {
		out.printf("Pay to the order of %s ", name);
		out.printf("(%s) ***$", jobTitle);
		out.printf("%,.2f\n", amountPaid);
	}

}
