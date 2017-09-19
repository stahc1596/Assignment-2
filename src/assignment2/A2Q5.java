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
        if(n != 1){
            System.out.print(binaryConvert(n/2));
            //Outputs the binary number from the method
        }
        return n%2;
        //Creates the Binary number to send back to the previous method
    }
    public static void main(String[] args) {
        A2Q5 test = new A2Q5();
        test.binaryConvert(156*2);
        //Takes the number and multiplies it by two to get the last digit, then
        //Sends it to the recursion method
        
    }
}
