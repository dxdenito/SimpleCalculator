   /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcgui;

/**
 *
 * @author n
 */
public class Calculator {
    public double add(double x, double y){
    return x + y;
    }
    public double multiply (double x, double y){
    return x*y;
    }
    public double minus (double x, double y){
    return x-y;
    }
    public double divide (double x, double y){
    if (y==0){
        throw new IllegalArgumentException("Attempt to divide by 0");
    }
    return x/y;
    }
    
}
