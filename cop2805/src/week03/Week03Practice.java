package week03;

import java.util.Scanner;

public class Week03Practice {
	
	//convert into a system for librarians
	//check books in/out

	public static void main(String[] args) {
		// 
		
		ATM atm = new ATM(10f);
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to ATM, enter command to Withdraw, Deposit, or See your Balance (W,D,B)");
		String command = input.nextLine();
		float balance = atm.getBalance();
		switch(command.toUpperCase()) {
		case "B":
			System.out.println("Current balance is "+ balance);
			printBalance(atm);
			break;
		
		case "W": 
			System.out.print("Enter amount to withdraw: ");
			String stringAmount = input.nextLine();
			float amount = Float.parseFloat(stringAmount);
			boolean result = atm.withdraw(amount);
			balance = atm.getBalance();
			System.out.println("Current balance is " + balance);
			break;
		
		case "D": 
			System.out.print("Enter amount to Deposit: ");
			stringAmount = input.nextLine();
			amount = Float.parseFloat(stringAmount);
			atm.deposit(amount);
			balance = atm.getBalance();
			System.out.println("Current balance is " + balance);
			break;  
			
		default:
			System.out.println("Unknown command");
		}

	}

	private static void printBalance(ATM atm) {
		// 
		System.out.println("Current balance is: " + atm.balance);
		
	}
	
	

}

class ATM{
	float balance = 0;
	
	public ATM(float balance) {
		this.balance = balance;
	}
	
	public float getBalance() {
		return this.balance;
	}
	
	public float deposit(float addAmount) {
		return balance += addAmount;
	}
	
	public boolean withdraw(float subtractAmount) {
		if(balance >= subtractAmount) {
			balance -= subtractAmount;
			return true;
		}else {
			return false;
		}
	}
}










