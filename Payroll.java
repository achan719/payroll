import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Q3_Payroll {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	//declared variables
	int found = 0, found2 = 0;

	//declare the lists to collect information
	ArrayList<String> name = new ArrayList<>();
	ArrayList<Integer> hours = new ArrayList<>();
	ArrayList<Integer> pay = new ArrayList<>();
	ArrayList<Integer> payRate = new ArrayList<>();

	System.out.println("================\n PAYROLL PROGRAM \n================ ");
	//initial data entry
	System.out.print("Enter the employee name: ");
	String name2 = sc.nextLine();

	//sentinel loop to allow user to exit as desire
	while(!name2.equalsIgnoreCase("done")){
		name.add(name2);
		System.out.print("\nEnter hours worked: ");
		int hours2 = sc.nextInt();
		hours.add(hours2);

		System.out.print("\nEnter hourly wage: ");
		int payRate2 = sc.nextInt();
		payRate.add(payRate2);

		int pay1 = hours2 * payRate2;
		pay.add(pay1);
		System.out.print("\nEnter the employee name ('done' to quit):  ");
		sc.nextLine();
		name2 = sc.nextLine();
	}//end of sentinel loop

	// array size
	System.out.print("\nYou've entered " + name.size() + " employees so far. To add more, " );

	// option to give the user to add more employees to the list
	System.out.print("enter the name of employee. Otherwise enter 'done' to quit: ");
	name2 = sc.nextLine();


	//sentinel loop to allow user to exit as desire
	while(!name2.equalsIgnoreCase("done")){
		name.add(name2);
		System.out.print("\nEnter hours worked: ");
		int hours2 = sc.nextInt();
		hours.add(hours2);

		System.out.print("\nEnter hourly wage: ");
		int payRate2 = sc.nextInt();
		payRate.add(payRate2);

		int pay1 = hours2 * payRate2;
		pay.add(pay1);
		System.out.print("\nEnter the employee name ('done' to quit): ");
		sc.nextLine();
		name2 = sc.nextLine();
	}//end of sentinel loop

	// allows user to SEARCH name in list
	System.out.print(" ");
	System.out.print("\nEnter the name of person to SEARCH: ");
	String search = sc.nextLine();
		do{
			for(int i=0;i<name.size();i++){
			if(name.get(i).equalsIgnoreCase(search)){
				System.out.println(search+" found");
				System.out.println(name.get(i)+" "+ hours.get(i)+ " "+ payRate.get(i) + " "+ pay.get(i));
				found=1;
				}
			}

			//if not input data is incorrect, it allows the user to re-enter
			if(found==0)
				System.out.println("ERROR: " + search + " not found. We do not have an employee named " + search);
				System.out.print("\nEnter the name of person to search ('done' to quit): ");
				search=sc.nextLine();
			}
		while(!search.equalsIgnoreCase("done"));

		// allows user to REMOVE name from list
		System.out.print("\nEnter the name of person to REMOVE from list: ");
		String removal = sc.nextLine();
		do{
			for(int i=0;i<name.size();i++){
			if(name.get(i).equalsIgnoreCase(removal)){
				System.out.println(removal +" removed");
				name.remove(i);
				hours.remove(i);
				pay.remove(i);
				payRate.remove(i);
				found2=1;
			}
		}

		//if not input data is incorrect, it allows the user to re-enter
		if(found2==0)
			System.out.println("ERROR: " + removal + " not found");
			System.out.print("\nEnter the name of person to remove from list ('done' to quit): ");
			removal = sc.nextLine();
		}
		while(!removal.equalsIgnoreCase("done"));

	System.out.println("=========================");
	// displays highest salary
	System.out.print("Highest Salary: ");
	System.out.println(java.util.Collections.max(pay));
	System.out.println("=========================");

	// displays data after removed names
	System.out.println("Names:\t\t" + name.toString());
	System.out.println("Hour Worked:\t" + hours.toString());
	System.out.println("Pay Rate:\t" + payRate.toString());
	System.out.println("Total Pay:\t" + pay.toString());

	}//end of main

}//end of payroll class