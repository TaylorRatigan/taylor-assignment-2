package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Assignment2Application {

		public static void main(String[] args) {
		 
		Random randomNumber = new Random();
		Scanner scanner = new Scanner(System.in);
		int random = (int) randomNumber.nextInt(100) + 1;
		int attempt = 5;
		
		
			System.out.println("Pick a number between 1 and 100");
			int guess = scanner.nextInt();
			
			
			if(guess > 100 || guess < 1) {
				System.out.println("Your guess is not between 1 and 100, please try again");
				attempt--;
			}
			else if(guess < random)  {
				System.out.println("Pick a higher number");
				attempt--;
			}
			else if(guess > random) {
				System.out.println("pick a lower number");
				attempt--;
			}
			
			else if(guess == random){
				System.out.println("You win!");
				scanner.close();
				break;
			}
		}
		 if(attempt == 0) {
			System.out.println("You lose!");
			System.out.println("The number to guess was: " + random);
		
		 }
	}		
				
}
	
	
	

