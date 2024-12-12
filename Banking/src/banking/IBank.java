/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package banking;

/**
 *
 * @author 2480396
 */
public interface IBank {
    /**
     * Add the new Client element to the clientList
     * 
     */
    void addClient(Client newClient);

    /**
     * Retrieve the selected Client (based on the client id) 
     * From the resulting Client, call its method to display the Accounts in the account list
     * 
     */
    void displayClientAccounts(int clientId);

    /**
     * Print every Client listed in the client list
     * 
     */
    void displayClientList();

    /**
     * Retrieve the selected Client (based on the client id) from the client list
     * 
     * return the retrieved Client object
     */
    Client getClient(int id);

    /**
     * Retrieve the selected Client (based on the client id) 
     * From the resulting Client, retrieve the selected Account (based on the account number) 
     * 
     * return the retrieved Account object
     */
    Account getClientAccount(int clientId, int accountNumber);
    
}


