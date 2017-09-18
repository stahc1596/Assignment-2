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
        if(n == 0){
            return 0;
        }else{
            if(n%b < 10){
                System.out.print(n%b);
            }else{
                System.out.print(s.charAt((n%b) - 10));
            }
            return convert(n/b, b);
        }
    }
    public static void main(String[] args) {
        A2Q6 test = new A2Q6();
        int i = test.convert(1000, 16);
    }
}
