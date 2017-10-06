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
            //If there are two letters that aren't the same, then return that
            //the word isn't a pallindrom
        }else if(length == (s.length() - 1) - length){
            return 1;
            //If the system reaches the middle of the word without finding a
            //difference in letters, then return saying it's a pallindrom
        }else{
            return isPalindrom(s, length + 1);
            //Use recursive until two letters don't match or if the method reaches
            //the middle of the word
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
