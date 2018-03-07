/*
 * Nick Dernovsek
 * netpay.java
 * This program will find the net pay of an employee
 */
package netpay;

/**
 *
 * @author nider6687
 */
public class Netpay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double h = 40;
        double w = 5.00;
        double i = 2.00;
        double t = 0.22;
        double n = 0.00;
        
        n=(h*w-i)-t*(h*w-i);
        System.out.println(n);
       }
    
}
