/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author stahc1596
 */
public class A2Q7 {

    public int isPalindrom(String s, int length){
        if(s.charAt(length) != s.charAt(s.length() - length)){
            return 0;
        }else if(length == s.length() - length){
            return 1;
        }else{
            return isPalindrom(s, length++);
        }
    }
    public static void main(String[] args) {
        A2Q7 test = new A2Q7();
    }
}
