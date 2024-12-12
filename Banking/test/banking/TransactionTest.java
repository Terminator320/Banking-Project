/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package banking;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author GeorgeVogas
 */
public class TransactionTest {
    
    public TransactionTest() {
    }

 
    /**
     * Test of equals method, of class Transaction.
     */
    @Test
    public void testEquals1() {
        System.out.println("equals 1");
        Object obj = null;
        Transaction instance = new Transaction();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
 
    @Test
    public void testEquals2() {
        System.out.println("equals 2");
        Transaction instance = new Transaction();
        Object obj = instance;
        boolean expResult = true;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEquals3() {
        System.out.println("equals 3");
        Transaction instance = new Transaction("deposit", 1000);
        Object obj = new Transaction("deposit", 1000);
        boolean expResult = true;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
   
    @Test
    public void testEquals4() {
        System.out.println("equals 4");
        Transaction instance = new Transaction("withdrawal", 700);
        Object obj = new Transaction("deposit", 700);
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
    
    @Test
    public void testEquals5() {
        System.out.println("equals 5");
        Transaction instance = new Transaction();
        Object obj = new Transaction("withdrawal", 5);
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
}
