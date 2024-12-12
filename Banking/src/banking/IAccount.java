/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package banking;

import java.util.ArrayList;
/**
 *
 * @author 2480396
 */
public interface IAccount {
    
    /**
     * Update the account balance with the amount of the deposit
     * Create the corresponding Transaction element and add it to the transactions list
     * 
     * return the new balance
     */
    double deposit(double d);

    /**
     * Print every Transaction listed in the transactions list
     * 
     */
    void displayAllTransactions();

    /**
     * getter for transactions Arraylist
     * 
     * return the Transaction list
     */
    ArrayList<Transaction> getTransactions(); // return null;

    /**
     * return the string that you want to output when printing the object
     */
    @Override
    String toString();

    /**
     * Update the account balance with the amount of the withdrawal
     * Create the corresponding Transaction element and add it to the transactions list
     * 
     * return the new balance
     */
    double withdrawal(double w);
}
