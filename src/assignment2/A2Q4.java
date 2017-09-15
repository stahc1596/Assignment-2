/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author stahc1596
 */
public class A2Q4 {

    public int hailstone(int n){
        System.out.println(n);
        //Output the number of hailstones at the start of the method
        if (n == 1){
            return n;
            //Base statement, the hailstones end at 1
        }else if(n%2 == 0){
            n = n/2;
            return hailstone(n);
            //If the hailstones are even, then they will do the equation for an
            //even amount of hailstones
        }else{
            n = 3 * n + 1;
            return hailstone(n);
            //If the hailstones are odd, then they will do the equation for an
            //odd amount of hailstones
        }
    }
    public static void main(String[] args) {
        A2Q4 test = new A2Q4();
        test.hailstone(12);
        //Starts the method
    }
}
