package squaresAndCubes;

import java.util.Scanner;

public class SquaresAndCubes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scnr = new Scanner(System.in);
		
		int i;
		int userInput;
		char restart;
		
		
		do {
			do {
			System.out.println("Please enter a positive integer:");
			userInput = scnr.nextInt();
			}
			while (userInput < 1);
			
			System.out.println("Number\tSquare\tCube");
			System.out.println("======\t======\t======");
			
			for (i = 1; i <= userInput; i++) {
				System.out.println(i + "\t" + (i *i) + "\t" + ((i * i) * i));	
			}
			
			System.out.println("Would you like to do it again? (y to continue)");
			restart = scnr.next().charAt(0);
		}
			while (restart == 'y');
	}

}
