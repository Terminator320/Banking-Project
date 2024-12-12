/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package banking;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 2480396
 */
public class AccountTest {
    
    public AccountTest(){
        
    }
    
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = new SavingsAccount();
        Account instance = new SavingsAccount();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
    
    @Test
    public void testEquals2() {
        System.out.println("equals2");
        Object obj = new SavingsAccount();
        ((Account)obj).deposit(15.0);
        Account instance = new SavingsAccount();
        
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }

    
    @Test
    public void testEquals3() {
        System.out.println("equals3");
        Object obj = new CheckingAccount();
        Account instance = new SavingsAccount();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
    
    @Test
    public void testEquals4() {
        System.out.println("equals4");
        Object obj = new CheckingAccount();
        Account instance = new CheckingAccount();
        instance.setAccountNumber(((Account)obj).getAccountNumber());
        boolean expResult = true;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }

    
    @Test
    public void testEquals5() {
        System.out.println("equals5");
        Object obj = new SavingsAccount();
        Account instance = new CheckingAccount();
        instance.setAccountNumber(((Account)obj).getAccountNumber());
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }


    @Test
    public void testDeposit() {
        System.out.println("deposit");
        double d = 10.0;
        Account instance = new CheckingAccount();
        double expResult = 10.0;
        double result = instance.deposit(d);
        assertEquals(expResult, result, 0.01);
    }

    
      @Test
    public void testDeposit2() {
        System.out.println("deposit2");
        double d = 1560.2665;
        Account instance = new SavingsAccount();
        double expResult = 1560.2665;
        double result = instance.deposit(d);
        assertEquals(expResult, result, 0);
    }
    
    
      @Test
    public void testDeposit3() {
        System.out.println("deposit3");
        double d = -7;
        Account instance = new CheckingAccount();
        double expResult = 0.0;
        double result = instance.deposit(d);
        assertEquals(expResult, result, 0);
    }
    
    
      @Test
    public void testDeposit4() {
        System.out.println("deposit4");
        double d = -1562.98;
        Account instance = new SavingsAccount();
        double expResult = 0.0;
        double result = instance.deposit(d);
        assertEquals(expResult, result, 0);
    }
    
    
      @Test
    public void testDeposit5() {
        System.out.println("deposit5");
        double d = 0.92;
        Account instance = new SavingsAccount();
        double expResult = 0.92;
        double result = instance.deposit(d);
        assertEquals(expResult, result, 0);
    }
    
    
      @Test
    public void testDeposit6() {
        System.out.println("deposit6");
        double d = 0.92;
        Account instance = new CheckingAccount();
        double expResult = 10.92;
        instance.deposit(5);
        instance.withdrawal(10);
        instance.deposit(15);
        double result = instance.deposit(d);
        assertEquals(expResult, result, 0.01);
    }
    

    @Test
    public void testWithdrawal() {
        System.out.println("withdrawal");
        double w = 10.0;
        Account instance = new CheckingAccount();
        double expResult = 0.0;
        double result = instance.withdrawal(w);
        assertEquals(expResult, result, 0.01);
    }
    
    
    @Test
    public void testWithdrawal2() {
        System.out.println("withdrawal2");
        double w = 1000.00;
        Account instance = new CheckingAccount();
        double expResult = 0.0;
        double result = instance.withdrawal(w);
        assertEquals(expResult, result, 0);
    }
    
    
    @Test
    public void testWithdrawal3() {
        System.out.println("withdrawal3");
        double w = 200.0;
        Account instance = new CheckingAccount();
        instance.deposit(300.0);
        double expResult = 100.0;
        double result = instance.withdrawal(w);
        assertEquals(expResult, result, 0);
    }
    
    
    @Test
    public void testWithdrawal4() {
        System.out.println("withdrawal4");
        double w = 200;
        Account instance = new SavingsAccount();
        instance.deposit(300.0);
        instance.deposit(50);
        instance.withdrawal(100);
        double expResult = 50.0;
        double result = instance.withdrawal(w);
        assertEquals(expResult, result, 0);
    }
    
     @Test
    public void testWithdrawal5() {
        System.out.println("withdrawal5");
        double w = 625.65;
        Account instance = new CheckingAccount();
        instance.deposit(300.0);
        instance.deposit(50);
        instance.withdrawal(100);
        instance.deposit(6000);
        double expResult = 5624.35;
        double result = instance.withdrawal(w);
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void testWithdrawal6() {
        System.out.println("withdrawal6");
        double w = 6800.50;
        Account instance = new CheckingAccount();
        instance.deposit(300.0);
        instance.deposit(500.689);
        instance.withdrawal(1000.785);
        instance.deposit(6000);
        double expResult = -1000.596;
        double result = instance.withdrawal(w);
        assertEquals(expResult, result, 0.001);
    }
    
    
}
