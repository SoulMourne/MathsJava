/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package count;

import soulmourne.maths.count.Factorial;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jgoodwin
 */
public class FactorialTest {
    
    public FactorialTest() {
    }

    /**
     * Test of factorial method, of class Factorial.
     */
    @Test
    public void testFactorial1() {
        System.out.println("factorial of 0");
        double n = 0;
        double expResult = 1;
        double result = Factorial.factorial(n);
        assertEquals(expResult, result, 0.0);
    }
    
        /**
     * Test of factorial method, of class Factorial.
     */
    @Test
    public void testFactorial2() {
        System.out.println("factorial of 1");
        double n = 1;
        double expResult = 1;
        double result = Factorial.factorial(n);
        assertEquals(expResult, result, 0.0);
    }
    
        /**
     * Test of factorial method, of class Factorial.
     */
    @Test
    public void testFactorial3() {
        System.out.println("factorial of 5");
        double n = 5;
        double expResult = 120;
        double result = Factorial.factorial(n);
        assertEquals(expResult, result, 0.0);
    }
    
        /**
     * Test of factorial method, of class Factorial.
     */
    @Test
    public void testFactorial4() {
        System.out.println("factorial of 9");
        double n = 9;
        double expResult = 362880;
        double result = Factorial.factorial(n);
        assertEquals(expResult, result, 0.0);
    }
    
}
