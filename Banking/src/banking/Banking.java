/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banking;


/**
 *
 * @author George Vogas
 */
public class Banking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Bank myBank = new Bank();
        myBank.setBankNumber("0123");
        myBank.setAddress("835 Sainte-Croix");

        /*testing
        Client c1 = new Client("ronald", "Raphael");
        Client c2 = new Client("Jane", "Raphael");
        Client c3 = new Client("Elodie", "Raphael");
        myBank.addClient(c3);
        myBank.addClient(c2);
        myBank.addClient(c1);

        c1.addAccount(new SavingsAccount());
        c3.addAccount(new SavingsAccount());
        c2.addAccount(new CheckingAccount());
        c3.addAccount(new CheckingAccount());
        c2.addAccount(new CheckingAccount());
        c2.addAccount(new SavingsAccount());
        c3.addAccount(new CheckingAccount());
        c1.addAccount(new CheckingAccount());
        c2.addAccount(new SavingsAccount());
        c1.addAccount(new CheckingAccount());
        c1.addAccount(new SavingsAccount());
        c3.addAccount(new SavingsAccount());
        */
    

    int option;
    do{
        option = UserInputManager.retrieveUserOption();
        System.out.println("You have selected option " + option);
        
        if(option == 1){ //Add a new Client
            Client clients = UserInputManager.retrieveClientInfo(); 
            myBank.addClient(clients); //adding it to the banks list of clients
            System.out.println("Thank you for becoming a client at " + myBank.getAddress());
            System.out.println("Here is your Client info: \nFirst name: " + clients.getFirstName() 
                    + " \nLast name: " + clients.getLastName() + "\nId number: "+ clients.getId());
            printLine();
        }
            
        
        if(option == 2){ //Create a new Account for a Client
            int id = UserInputManager.retrieveClientId();
            Client client = myBank.getClient(id);
            
            if(client != null){
                //System.out.println(client);
                Account type = UserInputManager.retrieveAccountType(); //add the account account
                client.addAccount(type);
                //giving them there account info
                System.out.println("Account created successfully for " + client.getFirstName() + " " + client.getLastName());
                System.out.println( type);
                printLine();
            }else{
                System.out.println("Client not found. Please try again.");
                printLine();
            }
        }   
        
        if(option == 3){// Make a Deposit
            int clientId = UserInputManager.retrieveClientId(); //indentify the clientid 
            int accountNumber = UserInputManager.retrieveAccountNumber(); //indentify the account
            Account acc = myBank.getClientAccount(clientId, accountNumber); //accessing the account 

            if(acc != null){
                System.out.println(acc);  
                double ammount = UserInputManager.retrieveTransactionAmount(); 
                acc.deposit(ammount); //making the deposit
                System.out.println(acc); //Receive a Receipt
                printLine();
            }else{
                System.out.println("Account "+ accountNumber +" not found.");
                printLine();
            }     
        }
            
        if(option == 4){ //Make a Withdrawal
            int clientId = UserInputManager.retrieveClientId(); //indentify the clientid 
            int accountNumber = UserInputManager.retrieveAccountNumber(); //indentify the account
            Account acc = myBank.getClientAccount(clientId, accountNumber); //accessing the account
                
            if(acc != null){
                System.out.println(acc);
                double ammount = UserInputManager.retrieveTransactionAmount();
                acc.withdrawal(ammount); 
                System.out.println(acc); //Receive a Receipt
                printLine();
            }else{
                System.out.println("Account "+ accountNumber +" not found.");
                printLine();
            }
        }
            
        if(option == 5){//List All Clients
            myBank.displayClientList();
        }
            
        if(option == 6){// List all Client Accounts
            int clientID = UserInputManager.retrieveClientId();
            myBank.displayClientAccounts(clientID);
        }
            
        if(option == 7){//List all Account Transactions
            int clientId = UserInputManager.retrieveClientId(); //indentify the clientid 
            int accountNumber = UserInputManager.retrieveAccountNumber(); //indentify the account
            Account acc = myBank.getClientAccount(clientId, accountNumber); //accessing the account
            
            if(acc != null){
                System.out.println(acc);
                acc.displayAllTransactions();
            }else{
                System.out.println("Account not found.");
                printLine();
            }
        }
        
        }while(option != 0);

    }
    
    
    
  
    
    public static void printLine(){
        System.out.println("--------------------------------------------------------");
    }
    
}

        