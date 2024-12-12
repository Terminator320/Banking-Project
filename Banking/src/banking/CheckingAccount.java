/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banking;

/**
 *
 * @author George Vogas
 */
public class CheckingAccount extends Account{
    public CheckingAccount(){
        super();
    }
    
    
    @Override
    public String toString() {
        return "Checking Account number " + this.accountNumber + " has a balance of $" + this.balance;
    }

    

}
