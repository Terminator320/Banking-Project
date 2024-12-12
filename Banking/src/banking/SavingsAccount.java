/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banking;

/**
 *
 * @author George Vogas
 */
public class SavingsAccount  extends Account{
    public SavingsAccount(){
        super();
    }
    
    
    @Override
    public String toString() {
        return "Savings Account number " + this.accountNumber + " has a balance of $" + this.balance;
    }
    
    
}
