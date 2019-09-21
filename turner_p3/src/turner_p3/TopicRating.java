//Cydni Turner

package turner_p3;

import java.util.Scanner;

public class TopicRating {

	public static void main(String[] args) {
		
		//Declare all needed items
		Scanner scnr = new Scanner(System.in);
		
		String[] topic = new String[5];
		int [][] responses = new int [5][10];
		double [] avgs = new double [5];
		
		int i; //row counter
		int j; //column counter
		char rate = 'Y'; //variable to let new poller add their responses
		int pollerNum = 1;
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
		
		//Initialize average array to 0
		for (i = 0; i<5; ++i) {
				avgs[i]= 0.0;
		}
		
		//Calculate averages
		for(i=0; i<5; ++i) {
			for(j=0; j<10; ++j) {
				avgs[i] = avgs[i] + (responses[i][j] * (j+1));
			}
			avgs[i] = avgs[i]/(responses[i][0] + responses[i][1] + responses[i][2] + responses[i][3] + responses[i][4] + responses[i][5] + responses[i][6] + responses[i][7] + responses[i][8] + responses[i][9]);
		}
		
		//Formatting
		System.out.print("\n\n");
		
		//Print data in table form 
		
		System.out.println("TOPICS       | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | AVERAGES");
		System.out.println("-------------|---|---|---|---|---|---|---|---|---|----|---------");
		System.out.printf(topic[0] + "     | " + responses[0][0] + " | " + responses[0][1] + " | " + responses[0][2] + " | " + responses [0][3] + " | " + responses[0][4] + " | " + responses[0][5] + " | " + responses[0][6] + " | " + responses[0][7] + " | " + responses[0][8] + " | " + responses[0][9] + "  |  %.2f", avgs[0]);
		System.out.println("\n-------------|---|---|---|---|---|---|---|---|---|----|---------");
		System.out.printf(topic[1] + "  | " + responses[1][0] + " | " + responses[1][1] + " | " + responses[1][2] + " | " + responses [1][3] + " | " + responses[1][4] + " | " + responses[1][5] + " | " + responses[1][6] + " | " + responses[1][7] + " | " + responses[1][8] + " | " + responses[1][9] + "  |  %.2f" , avgs[1]);
		System.out.println("\n-------------|---|---|---|---|---|---|---|---|---|----|---------");
		System.out.printf(topic[2] + "    | " + responses[2][0] + " | " + responses[2][1] + " | " + responses[2][2] + " | " + responses [2][3] + " | " + responses[2][4] + " | " + responses[2][5] + " | " + responses[2][6] + " | " + responses[2][7] + " | " + responses[2][8] + " | " + responses[2][9] + "  |  %.2f" , avgs[2]);
		System.out.println("\n-------------|---|---|---|---|---|---|---|---|---|----|---------");
		System.out.printf(topic[3] + "       | " + responses[3][0] + " | " + responses[3][1] + " | " + responses[3][2] + " | " + responses [3][3] + " | " + responses[3][4] + " | " + responses[3][5] + " | " + responses[3][6] + " | " + responses[3][7] + " | " + responses[3][8] + " | " + responses[3][9] + "  |  %.2f" , avgs[3]);
		System.out.println("\n-------------|---|---|---|---|---|---|---|---|---|----|---------");
		System.out.printf(topic[4] + "     | " + responses[4][0] + " | " + responses[4][1] + " | " + responses[4][2] + " | " + responses [4][3] + " | " + responses[4][4] + " | " + responses[4][5] + " | " + responses[4][6] + " | " + responses[4][7] + " | " + responses[4][8] + " | " + responses[4][9] + "  |  %.2f" , avgs[4]);
		System.out.println("\n----------------------------------------------------------------");
	}

}
