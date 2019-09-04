//Cydni Turner
//COP 3330
//Assignment 2 - Problem 1

package turner_p1;

import java.util.Scanner;

public class Encrypt {

	public static void main(String[] args) {
		
		//Declare variables 
		Scanner scnr = new Scanner(System.in);
		int n, n1, n2, n3, n4;
		int swap;
		
		
		//Ask user for input
		System.out.println("* * Encryption Application * *\n");
		System.out.print("Enter a 4 digit integer: ");
		
		//Get integer
		n = scnr.nextInt();
		
		//Code to split an integer into its individual digits
		n1 = n % 10;
    	n = n / 10;
    	n2 = n % 10;
    	n = n / 10;
    	n3 = n % 10;
    	n = n / 10;
    	n4 = n % 10;
    	n = n / 10;
		
		//Test
		System.out.printf("\nDigit Entered: %d%d%d%d ", n4, n3, n2, n1);
		
		//Carry out calculations
		n4 = (n4+7)%10;
		n3 = (n3+7)%10;
		n2 = (n2+7)%10;
		n1 = (n1+7)%10;
		
		//Carry out swapping first and third digits (n4 and n2)
		swap = n4;
		n4 = n2;
		n2 = swap;
		
		//Carry out swapping second and fourth digits (n3 and n1)
		swap = n3;
		n3 = n1;
		n1 = swap;
		
		
		//Print Encrypted Code
		System.out.printf("\n\nEncrypted Code: %d%d%d%d", n4, n3, n2, n1);
			

	}

}
