import java.util.Date;
import java.util.Scanner;

public class Account {
	 int balance;
	    int prevTransaction;
	    String customerName;
	    String customerID;

	    Account(String cname, String cid) {
	        customerID = cid;
	        customerName = cname;
	    }

	    void deposit(int amount) {
	        if (amount != 0 && amount > 0) {
	            balance = balance + amount;
	            prevTransaction = amount;
	        }
	    }

	    void withdraw(int amount) {
	        if(amount != 0) {
	            balance = balance - amount;
	            prevTransaction = -amount;
	        }
	    }

	    void getPrevTransaction() {
	        if (prevTransaction > 0) {
	            System.out.println("Deposited: " + prevTransaction);
	        } else if (prevTransaction < 0) {
	            System.out.println("WithDraw: " + Math.abs(prevTransaction));
	        } else {
	            System.out.println("No Transaction Occured!");
	        }
	    }
	    void showdate() {
			Date today = new Date();
			System.out.println(today.toString());
	    }
	    void showMenu() {
	        char option = '\0';
	        try (Scanner scanner = new Scanner(System.in)) {
	            System.out.println("Welcome, " + customerName + "!");
	            System.out.println("Your ID is: " + customerID);
	            System.out.println();
	            System.out.println("What would you like to do?");
	            System.out.println();
	            System.out.println("A. Check your Balance");
	            System.out.println("B. Make a deposit");
	            System.out.println("C. Make a withdraw");
	           System.out.println("D. View previous Transaction");
	           System.out.println("S.show Date");
	            System.out.println("E. Exit");
	            do {
	                System.out.println();
	                System.out.println("Please Enter an option: ");
	                char option1 = scanner.next().charAt(0);
	                option = Character.toUpperCase(option1);
	                System.out.println();
	                switch(option) {
	                    case 'A':
	                        System.out.println("==================");
	                        System.out.println("Balance = $" + balance);
	                        System.out.println("==================");
	                        break;
	                    case 'B':
	                        System.out.println("Enter an amount to deposit: ");
	                        int amount = scanner.nextInt();
	                        deposit(amount);
	                        break;
	                    case 'C':
	                        System.out.println("Enter an amount to withdraw: ");
	                        int amount2 = scanner.nextInt();
	                        withdraw(amount2);
	                        break;
	                    case 'D':
	                        System.out.println("=========== ");
	                        getPrevTransaction();
	                        System.out.println("=========== ");
	                        break;
	                    case 'S':
	                        System.out.println("=========== ");
	                    	showdate();
	                        System.out.println("=========== ");
	                         break;
	                    case 'E':
	                        System.out.println("=======");
	                        break;
	                    default:
	                        System.out.println("Error: Invalid Option. Please Enter A, B, C, D,S or E");
	                        break;
	                }
	            } while (option != 'E');
	            System.out.println("Thank You For Using Our ATM!");
	        }
	    }

	    
	    }

