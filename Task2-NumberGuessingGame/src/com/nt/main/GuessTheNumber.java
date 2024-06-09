package com.nt.main;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random =new Random();
		
		int secretNumber = random.nextInt(100)+1;
		int attempts = 0;
		int score = 0;
		boolean isGuessCorrect = false;
		
		System.out.println("Welcome To The Number Guessing Game");
		System.out.println("Shall we start ?");
		String answer = sc.next();
		
		System.out.println("You have 8 attempts to win");
		System.out.println("Score Card");
		System.out.println("Attempt 1 -> 200, Attempt 2 -> 175, Attempt 3 -> 150, Attempt 4 -> 125,"
				+ "Attempt 5 -> 100, Attempt 6 -> 75, Attempt 7 -> 50, Attempt 8 -> 25");
		
		if(answer.equals("Yes")|| answer.equals("yes")) {
			while(!isGuessCorrect && attempts<8) {
				System.out.println("Enter any number between 1 and 100:");
				String input = sc.next();
				
				if(!input.matches("\\d+")) {
					System.out.println("Invalid number! Please enter a valid number between 1 and 100");
					continue;
				}
				int guess = Integer.parseInt(input);
				attempts++;
				
				if(attempts==1) {
					score = 200;
				}
				else if(attempts==2) {
					score = 175;
				}
				else if(attempts==3) {
					score = 150;
				}
				else if(attempts==4) {
					score = 125;
				}
				else if(attempts==5) {
					score = 100;
				}
				else if(attempts==6) {
					score = 75;
				}
				else if(attempts==7) {
					score = 50;
				}
				else if(attempts==8) {
					score = 25;
				}
				if(guess==secretNumber) {
					isGuessCorrect = true;
					//score+=100;
					System.out.println("CONGRATULATIONS!! You have won");
					System.out.println("Attempts:" + attempts);
					System.out.println("Score:" + score);
					
				}
				else if(guess > secretNumber) {
					System.out.println("Too high! Try lower");
					
				}
				else if(guess < secretNumber) {
					System.out.println("Too Low! Try Higher");
					//System.out.println("score:"+ score);
					
				}
			}
			if(!isGuessCorrect) {
				System.out.println("You have used all the 8 attempts.The secret number was:"+ secretNumber);
			}
		}
		else if(answer.equals("No")|| answer.equals("no")) {
			System.out.println("See you next time.");
		}
		sc.close();

	}

}
