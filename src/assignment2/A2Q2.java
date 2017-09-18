/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author stahc1596
 */
public class A2Q2 {

    public int digitalRoot(int n, int sum){
        if(n == 0){
            return 0;
            //Base statement
        }else{
            sum = sum + (n % 10);
            //Find remainder to get the last digit in number and add it to the total
            n = n / 10;
            //Divide the number to remove the last digit
            if(n != 0){
                return digitalRoot(n, sum);
                //If all the digits haven't been calculated, then repeat the method
            }else{
                if(sum > 10){
                    return digitalRoot(sum, 0);
                    //If the total is above ten, then restart everything as the
                    //sum as our new number (n = sum)
                }else{
                    return sum;
                    //If the number is totaled and below ten, then the sum is
                    //returned back to the user
                }
            }

        }
    }

    public static void main(String[] args) {
        A2Q2 test = new A2Q2();
        int sum = test.digitalRoot(126, 0);
        System.out.println(sum);
        //Outputs number to user
    }
}
