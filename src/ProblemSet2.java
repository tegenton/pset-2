import java.util.Scanner;

public class ProblemSet2 {
	static Scanner in = new Scanner(System.in);
	
	public static void main (String[] args) {
		
		ProblemSet2 ps2 = new ProblemSet2();
		ps2.sayHello();
		ps2.gradeMe();
		ps2.groupUs();
		ps2.info();
		ps2.initials();
		
		in.close();
	}
	
	public void sayHello() {
		System.out.println("What is your full name?");
		System.out.println("Hello, " + in.nextLine() + "!");
	}
	
	public void gradeMe() {
		
		double[][] gradesrades = new double[3][3];
		
		int i = 0;
		
		System.out.println("What are your homework scores?");
		
		while (i < 3) {
			grades[0][i] = in.nextDouble();
			i++;
		}
		
		System.out.println("What are your quiz scores?");
		
		i = 0;
		
		while (i < 3) {
			hwGrades[i] = in.nextDouble();
			i++;
		}
		
		System.out.println("What are your test scores?");
		
		i = 0;
		
		while (i < 3) {
			hwGrades[i] = in.nextDouble();
			i++;
		}
	}
	
	public void groupUs() {
		
	}
	
	public void info() {
		
	}
	
	public void initials() {
		
	}
}