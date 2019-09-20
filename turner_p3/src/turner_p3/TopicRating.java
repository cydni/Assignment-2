//Cydni Turner

package turner_p3;

import java.util.Scanner;

public class TopicRating {

	public static void main(String[] args) {
		
		//Declare all needed items
		Scanner scnr = new Scanner(System.in);
		
		String[] topic = new String[5];
		int [][] responses = new int [5][10];
		
		int i; //row counter
		int j; //column counter
		char rate = 'Y'; //variable to let new poller add their responses
		int pollerNum = 1;
		//FIX ME: DO I REALLY NEED THIS VARIABLE?
		int rating; //variable to hold ratings from 1-10 
		
		topic[0] = "Politics";
		topic[1] = "Environment";
		topic[2] = "Education";
		topic[3] = "Sports";
		topic[4] = "Religion";
		
		//Greet user
		System.out.print("* * Welcome to the Polling App * *");
		
		while (rate != 'N') {
			
			System.out.println("\n\nHello poller number " + pollerNum + ". Rate the importance of each topic on a scale of 1 to 10.\n ");
			
			for(i = 0; i<5; ++i) { //row counting loop
				
				//Prompt and get user rating for all 5 topics
				System.out.print(topic[i] + ": ");
				rating = scnr.nextInt();
					
			}
			
			//Update while loop condition
			System.out.print("\nEnter another poller's ratings? (Y or N): ");
			rate = scnr.next().charAt(0);
			
			//Update pollerNum count
			pollerNum +=1;
			
		}
		
		
		/*for(j = 0; j<10; ++j) { //column counting loop
			
			System.out.println("\n\nHello poller number " + (j+1) + ". Rate the importance of each topic on a scale of 1 to 10.\n ");
			
			for(i = 0; i<5; ++i) { //row counting loop
				
				//Prompt and get user rating for all 5 topics
				System.out.print(topic[i] + ": ");
				rating = scnr.nextInt();
				
				
				
			}
			
		}*/
		
	}

}
