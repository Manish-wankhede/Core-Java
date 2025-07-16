// WAP to implement the inheritance

import java.util.*;

class Employee{

	String name;
	int id;

	Scanner s = new Scanner(System.in);

	void accept1(){

		System.out.print("\n Enter your name: ");
		name = s.nextLine();

		System.out.print("\n Enter your Id: ");
		id = s.nextInt();
	}
	void display1(){

		System.out.print("\n Name = "+name);
		System.out.print("\n Id = "+id);
	}
}
class Manager extends Employee{

	double salary;
	
	void accept2(){

		System.out.print("\n Enter Salary: ");
		salary = s.nextDouble();
	}
	void display2(){

		System.out.print("\n Salary = "+salary);
	}
}
class EmployeeInfo{

	public static void main(String args[]){

		Manager M = new Manager();
			
		// Accept()
		System.out.print("\n Proveide Details");

		M.accept1();
		M.accept2();

		// Display()
		System.out.print("\n\n Display Details");

		M.display1();
		M.display2();
	}
}
