package StackChallenge;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
      System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true....
        System.out.println(checkForPalindrome("Don't nod"));
    }

    public static boolean checkForPalindrome(String string) {

        LinkedList<Character> stack=new LinkedList<Character>();
        StringBuilder stringWithNoPunctuation=new StringBuilder( string.length() );
        String stringToLowerCase=string.toLowerCase();

        for(int i=0;i<string.length();i++){
            if(stringToLowerCase.charAt( i )>='a' && stringToLowerCase.charAt( i )<='z'){
                stringWithNoPunctuation.append( stringToLowerCase.charAt( i ) );
                stack.push( stringToLowerCase.charAt( i ) );
            }
        }
        StringBuilder reverseString=new StringBuilder(stack.size());

        while(!stack.isEmpty()){

            reverseString.append( stack.pop() );
        }

        if(reverseString.toString().equals( stringWithNoPunctuation.toString() )){
            return true;
        }
        else return false;
    }
}
