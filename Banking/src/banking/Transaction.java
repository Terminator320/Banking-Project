/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banking;

import java.util.Objects;

/**
 *
 * @author raphaelr
 */
public class Transaction implements ITransaction{
    private String type;
    private double amount;
    
    public Transaction(){
        this.type="withdrawal";
        this.amount=0.0;
    }
    
    public Transaction(String type){
        this.type = type;
        this.amount=0.0;
    }
    
    public Transaction(double amount){
        this.type="withdrawal";
        this.amount = amount;
    }
    
    public Transaction(String type, double amount){
        this.type = type;
        this.amount = amount;
    }
    
    public Transaction(double amount, String type){
        this.type = type;
        this.amount = amount;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "A transaction of " + this.amount + "$ of " + this.type;
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
        final Transaction other = (Transaction) obj;
        if (Double.doubleToLongBits(this.amount) != Double.doubleToLongBits(other.amount)) {
            return false;
        }
        return Objects.equals(this.type, other.type);
    }

    
    
}
