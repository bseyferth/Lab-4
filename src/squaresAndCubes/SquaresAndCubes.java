package squaresAndCubes;

import java.util.Scanner;

public class SquaresAndCubes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//open Scanner
		Scanner scnr = new Scanner(System.in);
		
		//Declare variables
		int i;
		int userInput;
		char restart;
		
		//Initial do loop is for the continuation question.
		do {
			//this do loop verifies your number is positive.
			do {
			System.out.println("Please enter a positive integer:");
			userInput = scnr.nextInt();
			}
			while (userInput < 1);
			
			//prints out the initial formatting titles and lines
			
			System.out.println("Number\tSquared\tCubed");
			System.out.println("=======\t=======\t=======");
			
			
			//prints out the response based on user input in correct spacing
			for (i = 1; i <= userInput; i++) {
				System.out.println(i + "\t" + (i *i) + "\t" + ((i * i) * i));	
			}
			
			//collects restart response from user and reacts
			System.out.println("Would you like to do it again? (y to continue)");
			restart = scnr.next().charAt(0);
		}
			while (restart == 'y');
		
		//alerts user program ended
		System.out.println("Goodbye!");
		scnr.close();
	}

}
