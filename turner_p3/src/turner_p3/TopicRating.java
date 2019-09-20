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
		
		topic[0] = "Politics";
		topic[1] = "Environment";
		topic[2] = "Education";
		topic[3] = "Sports";
		topic[4] = "Religion";
		
		for(j = 0; j<10; ++j) { //column counting loop
			
			System.out.println("\n\nHello poller number " + (j+1) + ". Rate the importance of each topic on a scale of 1 to 10.\n ");
			
			for(i = 0; i<5; ++i) { //row counting loop
				
				//Prompt and get user rating for all 5 topics
				System.out.println(topic[i] + ": ");
			
				
				
			}
			
		}
		
	}

}
