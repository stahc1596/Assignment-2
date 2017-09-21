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
        if(s.charAt(length) != s.charAt((s.length()- 1) - length)){
            return 0;
        }else if(length == (s.length() - 1) - length){
            return 1;
        }else{
            return isPalindrom(s, length + 1);
        }
    }
    public static void main(String[] args) {
        A2Q7 test = new A2Q7();
        int p = test.isPalindrom("radar", 0);
        //Starts the recursion
        if(p == 1){
            System.out.println("true");
            //If the word is a pallindrom, then the system tells the user it is
        }else{
            System.out.println("False");
            //If the word isn't a pallindrom, then the system tells the user it isn't
        }
    }
}
