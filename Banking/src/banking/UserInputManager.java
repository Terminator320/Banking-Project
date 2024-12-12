/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banking;

import java.util.Scanner;

/**
 *
 * @author George Vogas
 */
public class UserInputManager{
    
    public static int retrieveAccountNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please entre your account number: ");
        int accountNum = sc.nextInt();

        return accountNum;
    }

    public static Account retrieveAccountType() {
        Scanner sc = new Scanner(System.in);
        Account account = null;
        int input;
       
        do{
            System.out.println("What type of account would you like to make ");
            System.out.println("[1] Saving Account \n[2] Checking Account");
            input = sc.nextInt();
            
            if(input == 1){
                System.out.println("Making a new Saving Account.... Please hold");
                account = new SavingsAccount();
            }
            else if(input == 2){
                System.out.println("Making a new Checking Account..... Please hold");
                account = new CheckingAccount();
            }else {
                System.out.println("Invalid choice. Please try again.");
                System.out.println("-----------------------------");
            }
        }while(account == null);
        
        return account;
    }

    public static int retrieveClientId() {
         Scanner sc = new Scanner(System.in);
         System.out.print("Please entre your client id number: ");
         int ClientID = sc.nextInt();
         
         return ClientID;
    }

    public static Client retrieveClientInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your first name: ");
        String firstName = sc.next();
        
        System.out.print("What is your last name: ");
        String lastName = sc.next();
        
        Client client = new Client(firstName, lastName);
        
        return client;
    }

    public static double retrieveTransactionAmount() {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is amount: ");
        double amount = sc.nextDouble();
        
        return amount;
    }

    public static int retrieveUserOption() {
        System.out.printf("%-38s\n","Please select one of the following options");
        System.out.printf("%-38s","[1] Add a new Client");
        System.out.printf("%-38s\n","[2] Create a new Account for a Client");
        System.out.printf("%-38s","[3] Make a Deposit");
        System.out.printf("%-38s\n","[4] Make a Withdrawal");
        System.out.printf("%-38s","[5] List All Clients");
        System.out.printf("%-38s\n","[6] List all Client Accounts");
        System.out.printf("%-38s","[7] List all Account Transactions");
        System.out.printf("%-38s\n","[0] Exit");
        
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();  
        
        return option;
    }
    

}
