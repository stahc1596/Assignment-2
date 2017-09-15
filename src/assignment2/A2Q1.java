/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author stahc1596
 */
public class A2Q1 {

    public int digitalSum(int n, int sum){
        if(n == 0){
            return 0;
            //Base statement
        }else{
            sum = sum + (n % 10);
            //Find remainder to get the last digit in number and add it to the total
            n = n / 10;
            //Divide the number to remove the last digit
            if(n != 0){
                return digitalSum(n, sum);
                //If all the digits haven't been calculated, then repeat the method
            }else{
                return sum;
                //If all digits are summed up, then return the number
            }
        }
    }
    public static void main(String[] args) {
        A2Q1 test = new A2Q1();
        int sum = test.digitalSum(126, 0);
        System.out.println(sum);
        //Outputs number to user
    }
}
