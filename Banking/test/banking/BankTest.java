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
public class BankTest {
    
    public BankTest() {
    }

   
    /**
     * Test of equals method, of class Bank.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = new Bank();
        Bank instance = new Bank();
        boolean expResult = true;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEquals2() {
        System.out.println("equals2");
        Object obj = new Bank("834", "119 Jean-Talon");
        Bank instance = new Bank();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEquals3() {
        System.out.println("equals3");
        Object obj = new Bank("1", "658 Main St");
        Bank instance = new Bank();
        instance.setAddress(((Bank) obj).getAddress());
        instance.setBankNumber(((Bank) obj).getBankNumber());
        boolean expResult = true;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }

     @Test
    public void testEquals4() {
        System.out.println("equals4");
        Object obj = new Bank("2", "456 Elmo St");
        Bank instance = new Bank("3", "698 Big Bird St");
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
    
     @Test
    public void testEquals5() {
        System.out.println("equals5");
        Object obj = new Bank("2", "456 Elmo St");
        Bank instance = new Bank("3", "698 Big Bird St");
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
}
