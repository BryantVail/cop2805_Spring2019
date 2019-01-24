package week03;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {

	//convert into a system for librarians
		//check books in/out

		public static void main(String[] args) {
			// 
			
			
			LibraryApp library = new LibraryApp( new ArrayList<Book> ());
			library.addBook(new Book("Gone with the wind", 1111, 10));
			library.addBook(new Book("Harry Potter", 1112, 15)); 
			library.addBook(new Book("Design Patterns", 1113, 3)); 
			library.addBook(new Book("Java", 1114, 2));
			
			Scanner input = new Scanner(System.in);
			System.out.println("Welcome to ATM, enter command to Checkout, Deposit, or See your Books (C,R,B)");
			String command = input.nextLine();
			float balance = atm.getBalance();
			switch(command.toUpperCase()) {
			case "B":
				
				System.out.println("The Books in the library are: "+ books);
				printBalance(atm);
				break;
			
			case "R": 
				System.out.print("Enter Book to Checkout: ");
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

		private static void printBooks(Book books) {
			// 
			System.out.println("Current Books are: " + books);
			
		}
		
		

	}

	class LibraryApp {
		float balance = 0;
		ArrayList<Book> books = new ArrayList<Book>();
		
		
		public LibraryApp(ArrayList<Book> books) {
			this.books.addAll(books);
		}
		
		public boolean addBook(Book book) {
			// 
			if(book != null) {
				this.books.add(book);
				return true;
			}else {
				return false;
			}
			
		}

		public ArrayList<Book> getBooks() {
			return this.books;
		}
		
		public void returnBook(Book book) {
			int index = books.indexOf(book);
			this.books.get(index).
		}
		
		public boolean checkoutBook(Book book) {
			if(books.contains(book)) {
				return true;
			}else {
				return false;
			}
		}

	}
	
	class Book {
		String title;
		int id;
		int checkedOutCopies;
		int availableCopies;
		int totalCopies;
		
		public Book(String title, int id, int totalCopies) {
			this.title = title;
			this.id = id;
			this.totalCopies = totalCopies;
		}
		
		public boolean addToAvailableCopies(Book book) {
			if(book != null) {
				this.availableCopies 	+= 1;
				this.checkedOutCopies	+= 1;
				return true;
			}else {
				return false;
			}
			
		}
		
		public int addToAvailableCopies(Book book, int numberOfCopies) {
			return this.availableCopies += numberOfCopies;
		}
	}
