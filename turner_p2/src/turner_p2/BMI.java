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
	System.out.print("\nEnter your choice (1 or 2): ");
	
	choice = scnr.nextInt();
	
	if(choice == 1) {
		
	System.out.println("\nYou selected POUNDS and INCHES");
	
	//Get height
	System.out.print("\n\nEnter your height (in): ");
	height = scnr.nextInt();
	
	//Get weight
	System.out.print("\nEnter your weight (lbs): ");
	weight = scnr.nextInt();
	
	//Calculation
	bmi = (703*weight)/(height*height);
	
		
	System.out.println("\nYour BMI is " + bmi);
	
	}
	else if (choice == 2) {
		
	System.out.println("\nYou selected KILOS and METERS");
	
	//Get height
    System.out.print("\n\nEnter your height (m): ");
	height = scnr.nextInt();
		
	//Get weight
	System.out.print("\nEnter your weight (kgs): ");
	weight = scnr.nextInt();
	
	//Calculation
	bmi = weight/(height*height);
	
	System.out.println("\nYour BMI is " + bmi);
		
	}
	else {
		
	//User has not chosen a valid option
	System.out.println("\nINVALID CHOICE");
	
	}
	
	//Display Categories
	/*BMI Categories: 
	Underweight = <18.5
	Normal weight = 18.5–24.9 
	Overweight = 25–29.9 
	Obesity = BMI of 30 or greater */
	
	System.out.println("\n\nBMI Categories:");
	System.out.println("\nUnderweight = <18.5");
	System.out.println("\nNormal weight = 18.5-24.9");
	System.out.println("\nOverweight = 25-29.9");
	System.out.println("\nObese = 30+");
	

	}

}
