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
		
		double[][] grades = new double[3][3];
		String[] types = {"homework", "quiz", "test"};
		
		for (int i = 0; i < 3; i++) {
			System.out.println("What are your " + types[i] + " grades?");
			for (int j = 0; j < 3; j++)
				grades[i][j] = in.nextDouble();
		}
		int i = 0;
		System.out.println("Your average is " + ( (0.15 * grades[0][i++] + grades[0][i++] + grades[0][i++]) + ( 0.3 ) + "%");
		
	}
	
	public void groupUs() {
		
	}
	
	public void info() {
		
	}
	
	public void initials() {
		
	}
}
