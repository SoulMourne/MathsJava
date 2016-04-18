/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package count;

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
    public void testFactorial() {
        System.out.println("factorial");
        double n = 1;
        int m = 4;
        double expResult = 24;
        double result = Factorial.factorial(n,m);
        assertEquals(expResult, result, 0.0);
    }
    
}
