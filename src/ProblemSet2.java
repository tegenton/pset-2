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
		System.out.println("Your average is " + ( (0.15 * (grades[0][i++] + grades[0][i++] + grades[0][i++])) + ( 0.3 * ( grades[1][i=0] + grades[1][++i] + grades[1][++i]))  + (0.55 * ( grades[2][i=0] + grades[2][++i] + grades[2][++i] ) ) ) / 3 + "%");
		
	}
	
	public void groupUs() {
		
		System.out.println("How many students will be coming?");
		int totalPeople = in.nextInt();
		System.out.println("How many teachers will be coming?");
		totalPeople += in.nextInt();
		if ( totalPeople % 47 == 0 ) System.out.println("You will need " + totalPeople / 47 + " busses of 48 people (including the driver)");
		else {
			int busses = (totalPeople / 47) + 1;
			System.out.println("You will need " + (busses - 1) + " full bus"  + ( busses - 1 != 1 ? "ses" : "") + " and one bus of " + totalPeople % 47  + " people");
		}
	}
	
	public void info() {
		String[] info = new String[5];
		String[] questions = {"first name", "last name", "grade", "age", "hometown"};
		
		for (int i = 0; i < 5; i++) {
			System.out.println("What is your " + questions[i] + "?");
			info[i] = in.nextLine();
		}
	}
	
	public void initials() {
		
	}
}
