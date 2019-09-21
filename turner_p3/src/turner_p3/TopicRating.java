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
		
		//initialize response array to 0 for all cells
		for (i = 0; i<5; ++i) {
			for (j=0; j<10; ++j) {
				responses[i][j]=0;
			}
		}
		
		//Initialize topic array
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
				
				//Populate responses array
				responses[i][rating-1]+=1;
					
			}
			
			//Update while loop condition
			System.out.print("\nEnter another poller's ratings? (Y or N): ");
			rate = scnr.next().charAt(0);
			
			//Update pollerNum count
			pollerNum +=1;
			
		}
		
		//Formatting
		System.out.print("\n\n");
		
		//Print data in table form 
		
		System.out.println(topic[0] + ": " + responses[0][0] + " " + responses[0][1] + " " + responses[0][2] + " " + responses [0][3] + " " + responses[0][4] + " " + responses[0][5] + " " + responses[0][6] + " " + responses[0][7] + " " + responses[0][8] + " " + responses[0][9]);
		
		
		
		
		
		
		
		
		/*for(i=0; i<5; ++i) {
			System.out.print("\n" + topic[i]+ ": ");
			for(j=0; j<10; ++j) {
				System.out.print(responses[i][j] + " ");
				
			}
			
		}*/
	
		
	}

}
