//Cydni Turner
//COP 3330
//Assignment 2 - Problem 1

package turner_p1;

import java.util.Scanner;

public class Encrypt {

	public static void main(String[] args) {
		
		//Declare variables 
		Scanner scnr = new Scanner(System.in);
		//int Num;
		int n1;
		int n2;
		int n3;
		int n4;
		
		//Ask user for input
		System.out.println("* * Encryption Application * *\n");
		System.out.println("Enter a 4 digit integer: ");
		
		//Get integer
		//Num = scnr.nextInt();
		n1 = scnr.nextInt();
		n2 = scnr.nextInt();
		n3 = scnr.nextInt();
		n4 = scnr.nextInt();
		
		//Test
		System.out.printf(" %d %d %d %d ", n1, n2, n3, n4);
		

	}

}
