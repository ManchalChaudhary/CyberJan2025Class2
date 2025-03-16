package variables;

import java.util.Scanner;

public class Userinput {

	public static void main(String[] args) {
		
		Scanner ui = new Scanner(System.in);  //object for class Scanner
		Scanner ui1 = new Scanner(System.in);
		
//		System.out.println("What is your name?");
//		String userName = ui.nextLine(); //variable for String
//		System.out.println("My name is " + userName +".");
//
//		
//		System.out.println("How old are you?");
//		int age = ui.nextInt();
//		
//		System.out.println("Where are you from?");
//		String place = ui1.nextLine();
//		System.out.println("My name is " + userName +"." +" I am " + age+ 
//				" years old." + " I am from " + place + ".");
		System.out.println("What is your salary?");
		double salary = ui.nextDouble();
		 System.out.println("My salary is: " + String.format("%.2f", salary));
		 System.out.println("what is your raise?");
		 double raise = ui.nextDouble();
		 double totalSalary = salary+raise;
		 System.out.println(totalSalary);
		 System.out.println("paragraph");
		ui.close();

	}

}
