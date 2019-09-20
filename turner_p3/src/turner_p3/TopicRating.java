//Cydni Turner

package turner_p3;

import java.util.Scanner;

public class TopicRating {

	public static void main(String[] args) {
		
		//Declare all needed items
		Scanner scnr = new Scanner(System.in);
		String[] topic = new String[5];
		int [][] responses = new int [5][10];
		
		topic[0] = "political issues";
		topic[1] = "environmental issues";
		topic[2] = "education";
		topic[3] = "sports";
		topic[4] = "religion";
		
		for(int i = 0; i<5; ++i) {
			
			System.out.println(topic[i]);
			
		}
		
	}

}
