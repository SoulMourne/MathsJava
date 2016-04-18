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
public class Factorial {
    
    /**
     * Calculate the factorial of a number
     * @param n the number we want to know the factorial
     * @return the factorial of the number
     */
    public static double factorial(double n)
    {
        double res = 1;
        for (int i = 1; i<= n; i++)
        {
            res *= i;
        }
        return res;
    }    
    
}
