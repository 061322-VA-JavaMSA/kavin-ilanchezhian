package com.revature.scanner;
import java.util.Scanner;

public class scannerMenu {
	
	static Scanner scan;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		scan = new Scanner(System.in);
		menu();
		scan.close();
	}
	public static void loginScreen(){
		String username = "admin";
		String password = "pass";
		
		System.out.println("Please enter your username");
		String usernameInput = scan.nextLine();
		
		System.out.println("Please enter your password");
		String passwordInput = scan.nextLine();
	
		if(username.equals(usernameInput) && password.equals(passwordInput)) {
			System.out.println("Welcome!");
		} else {
			System.out.println("Invalid credentials.");
		}
	}
	
	public static void menu() {
		/*
		 * Menu that gives a user multiple options:
		 * 	- 1: get a random number
		 *  - 2: reverse a String of the user's choice
		 *  - 3: exit the program
		 *  
		 *  this menu should repeat until the user decides to exit
		 */
		
		int option;
		System.out.println("You have 3 options\n- 1: get a random number\n- 2: reverse a String of your choice\n- 3: exit the program");
		
		do {
			System.out.println("Which option would you like to choose?");
			option = scan.nextInt();
			scan.nextLine();
			
			switch(option) {
			
			case 1:
				System.out.println("Here is a random number: " + Math.floor(Math.random()*(1000000)));
				break;
			case 2:
				System.out.println("Enter the String");
				String input = scan.nextLine();
				StringBuilder str = new StringBuilder(input);
				System.out.println("Here is the reversed string: " + str.reverse());
				break;
			default:
				System.out.println("Exiting the Program");
				break;
			} 
			
		} while(option != 3);
	}

}
