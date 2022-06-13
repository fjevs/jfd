package student;

public class Student {
	private String name;
	private int idnum;
	private double gpa;
	private Major major;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIdnum() {
		return idnum;
	}
	public void setIdnum(int idnum) {
		this.idnum = idnum;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public Major getMajor() {
		return major;
	}
	public void setMajor(Major major) {
		this.major = major;
	}
	
	public Student(String name, int idnum, double gpa, Major major) {
		this.name = name;
		this.idnum = idnum;
		this.gpa = gpa;
		this.major = major;
	}
	
	public Student(String name, int idnum, double gpa) {
		this.name = name;
		this.idnum = idnum;
		this.gpa = gpa;
		this.major = null;
	}
	
	public Student(String name, int idnum, Major major) {
		this.name = name;
		this.idnum = idnum;
		this.gpa = 0;
		this.major = major;
	}
	
	public Student(String name, int idnum) {
		this.name = name;
		this.idnum = idnum;
		this.gpa = 0;
		this.major = null;
	}
	
}
