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
public class ClientTest {
    
    public ClientTest() {
    }

    
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = new Client();
        Client instance = new Client();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }

    @Test
    public void testEquals2() {
        System.out.println("equals2");
        Object obj = new Client("George", "Vogas");
        Client instance = new Client();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
   
    @Test
    public void testEquals3() {
        System.out.println("equals3");
        Object obj = new Client();
        Client instance = new Client();
        instance.setId(((Client)obj).getId());
        boolean expResult = true;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEquals4() {
        System.out.println("equals4");
        Object obj = new Client("George","Vogas");
        Client instance = new Client("George","Vogas");
        instance.setId(((Client)obj).getId());
        boolean expResult = true;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEquals5() {
        System.out.println("equals5");
        Object obj = new Client("George","Vogas");
        Client instance = new Client("Evans","Vogas");
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
}
