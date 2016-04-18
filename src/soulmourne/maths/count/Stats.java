/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soulmourne.maths.count;

/**
 *
 * @author jgoodwin
 */
public class Stats {
    /**
     * Calculates the average number of a list
     * @param values the list containing the values
     * @return the average number
     */
    public static double avg(double [] values)
    {
        double res = 0;
        for (double value : values)
            res += value;
        res = res/values.length;
        return res;
    }
}
