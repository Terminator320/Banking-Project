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
public abstract class Account implements IAccount{
    protected static int counter = 1; 

    protected int accountNumber;
    protected double balance;
    protected Client owner;
    
    protected ArrayList<Transaction> transction;
    
    public Account(){
        this.accountNumber = counter;
        counter = counter+1;
        this.balance = 0.0;
        this.owner = null;
        this.transction = new ArrayList<Transaction>();
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Account.counter = counter;
    }
    
    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Client getOwner() {
        return this.owner;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
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
        final Account other = (Account) obj;
        if (this.accountNumber != other.accountNumber) {
            return false;
        }
        if (Double.doubleToLongBits(this.balance) != Double.doubleToLongBits(other.balance)) {
            return false;
        }
        return Objects.equals(this.owner, other.owner);
    }

    
    @Override
    public String toString() {
        return "Your account number is " + this.accountNumber +
                ". The owner of this account is " + this.owner.getFirstName() 
                + " "  + this.owner.getLastName() 
                + ". The current balance is $" + this.balance;          
    }
    
    
    @Override
    public double deposit(double d) {
        Transaction t = new Transaction("deposit", d);
        if(d <= 0.0 ||d >= Double.MAX_VALUE){
            System.out.println("You can not deposit $" + d);
        }else{
            this.balance = balance + d;
            transction.add(t); 
        }
        return this.balance;
    }
    
    
    @Override
    public double withdrawal(double w) { 
        Transaction t = new Transaction("withdrawal", w);
         if(w <= 0.0 || w >= Double.MAX_VALUE || this.balance == 0.0){
            System.out.println("You can not withdrawal $" + w);
        }else{
            this.balance = balance - w;
            transction.add(t); 
        }
        return this.balance;
    }
    
    
    @Override
    public void displayAllTransactions() {
        for (int i = 0; i < transction.size(); i++) {
            System.out.println(transction.get(i));
            System.out.println("-------------------------");
        }
    }

    
    @Override
    public ArrayList<Transaction> getTransactions() {
            return transction;
    }


}
