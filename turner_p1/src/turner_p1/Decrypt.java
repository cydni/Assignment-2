//Cydni Turner

package turner_p1;

import java.util.Scanner;

public class Decrypt {

	public static void main(String[] args) {
		
		//Declare variables 
		Scanner scnr = new Scanner(System.in);
		int n, n1, n2, n3, n4;
		int swap;
		
		//Ask user for input
		System.out.println("* * Decryption Application * *\n");
		System.out.print("Enter a 4 digit code: ");
		
		//Get code
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
		
		System.out.printf("\nCode Entered: %d%d%d%d", n4, n3, n2,n1);
				
		
		
		
		

	}

}
