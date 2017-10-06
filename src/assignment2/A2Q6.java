/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author stahc1596
 */
public class A2Q6 {

    public int convert(int n, int b){
        String s = "ABCDEF";
        //String to take characters from
        if(n > 0){
            int x = convert(n/b, b);
            //Recursion
            if(x < 10 && x > 0){
                System.out.print(x);
                //If the remainder is less than ten, then the system will ouput
                //the number
            }else if(x >= 10){
                System.out.print(s.charAt(x - 10));
                //If the remainder is above ten, then the system will output the
                //corresponding letter from the string
            }
        }
        //If statement does recursion as long as the number isn't zero
            return n%b;
            //Base statement
        
    }
    public static void main(String[] args) {
        A2Q6 test = new A2Q6();
        int a = 1000;
        //Positive integer
        int b = 16;
        //Positive base
        int i = test.convert(a*b, b);
    }
}
