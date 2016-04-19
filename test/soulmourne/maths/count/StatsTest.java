/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soulmourne.maths.count;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jgoodwin
 */
public class StatsTest {
    
    public StatsTest() {
    }

    /**
     * Test of avg method, of class Stats.
     */
    @Test
    public void testAvg() {
        System.out.println("avg");
        double[] values = {9,12,8,7,17,12,5,10,20,15};
        double expResult = 11.5;
        double result = Stats.avg(values);
        assertEquals(expResult, result, 0.0);
    }
    
}
