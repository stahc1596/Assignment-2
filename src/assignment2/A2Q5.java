/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author stahc1596
 */
public class A2Q5 {

    public int binaryConvert(int n){
        if(n == 1){
            return 1;
            //Base statement
        }else{
            System.out.print(n%2);
            //Gives remainder of the System
            return binaryConvert(n/2);
            //Divides number by two and finds the next digit in binary number
        }
    }
    public static void main(String[] args) {
        A2Q5 test = new A2Q5();
        test.binaryConvert(156);
        System.out.println(1);
        //Outputs last number of every Binary code
    }
}
