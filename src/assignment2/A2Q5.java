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
        }else{
            System.out.print(n%2);
            return binaryConvert(n/2);
        }
    }
    public static void main(String[] args) {
        A2Q5 test = new A2Q5();
        test.binaryConvert(156);
        System.out.println(1);
    }
}
