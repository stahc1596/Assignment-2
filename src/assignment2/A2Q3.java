/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author stahc1596
 */
public class A2Q3 {

    public int triangle(int n, int sum){
        if(n > 0){
            sum = sum + n;
            //add the blocks in the row to the total number of blocks
            return triangle(n-1, sum);
            //go to the next row
        }else{
            return sum;
            //if there are no more rows, return the total of blocks
        }
    }
    public static void main(String[] args) {
        A2Q3 test = new A2Q3();
        int sum = test.triangle(3, 0);
        System.out.println(sum);
        //output the total number of blocks
    }
}
