//Cydni Turner

package turner_p2;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		
	System.out.println("* * BMI Calculator * *");
		
	//Declare Variables
	int height, weight, bmi, choice;
	Scanner scnr = new Scanner(System.in);
	
	//Get an option
	System.out.println("\nCALCULATION OPTIONS: \n\n1. Pounds and inches \n\n2. Kilos and meters\n");
	System.out.print("Enter your choice (1 or 2): ");
	
	choice = scnr.nextInt();
	
	if(choice == 1) {
		
	System.out.println("\nYou selected pounds and inches");
	
	//Get height
	System.out.print("\nEnter your height: ");
	height = scnr.nextInt();
	
	//Get weight
	System.out.print("\nEnter your weight: ");
	weight = scnr.nextInt();
	
	
		
	}
	else if (choice == 2) {
		
	System.out.println("\nYou selected kilos and meters");
	
	//Get height
    System.out.print("\nEnter your height: ");
	height = scnr.nextInt();
		
	//Get weight
	System.out.print("\nEnter your weight: ");
	weight = scnr.nextInt();
		
	}
	else {
		
	//User has not chosen a valid option
	System.out.println("\nINVALID CHOICE");
	
	}


	}

}
