package student;
import static java.lang.System.out;

public class UseStudent {

	public static void main(String[] args) {
		Student stu = new Student("Sux", 64);
		out.println(stu.getName() + " " + stu.getIdnum() + " " + stu.getMajor() + " " + stu.getGpa());
		
		stu = new Student("Sux", 64, Major.LITERATURE);
		out.println(stu.getName() + " " + stu.getIdnum() + " " + stu.getMajor() + " " + stu.getGpa());
		
		stu = new Student("Sux", 64, 3.0, Major.COMPUTER_SCIENCE);
		out.println(stu.getName() + " " + stu.getIdnum() + " " + stu.getMajor() + " " + stu.getGpa());
		
		stu = new Student("Sux", 64, 4.0, Major.HISTORY);
		out.print(stu.getName() + " " + stu.getIdnum() + " " + stu.getMajor() + " " + stu.getGpa());
	}

}
