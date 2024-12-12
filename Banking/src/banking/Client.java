/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banking;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author George Vogas
 */
public class Client implements IClient{
    private static int counter = 1; 
    private int id;
    private String firstName;
    private String lastName;
    private ArrayList<Account> accountList;

    
    public Client() {
        this.id = counter;
        counter++;
        this.firstName="";
        this.lastName="";
        this.accountList = new ArrayList<Account>();
    }

    public Client(String firstName, String lastName) {
        this.id = counter;
        counter++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountList = new ArrayList<Account>();
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Client other = (Client) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        return Objects.equals(this.lastName, other.lastName);
    }
    
    
    @Override
    public String toString() {
        return "Client first name is " + this.firstName + " and last name is " 
                + this.lastName + ". There Id number is " + this.id;
    }

    
    @Override
    public void addAccount(Account newAccount) {
        if(newAccount != null){
            accountList.add(newAccount); 
            newAccount.setOwner(this); //need to set the owner 
            System.out.println("We have added a account" );    
        }else{
            System.out.println("Can not add the account");
            System.out.println("------------------------");
        }
    }

    
    @Override
    public void displayAccounts() {
        for (int i = 0; i < accountList.size(); i++) {
            System.out.println(accountList.get(i));
            System.out.println("-----------------------");
        }
    }

    
    @Override
    public Account getAccount(int accountNumber) {
        
        for(Account account: accountList){
            if(account.getAccountNumber() == accountNumber){
                return account;
            }
        }
       return null;
    }
    
    
}

    
    

