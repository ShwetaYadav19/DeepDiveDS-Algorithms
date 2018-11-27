package Queues_Challenge;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.ArrayBlockingQueue;

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
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
    }

    public static boolean checkForPalindrome(String string) {


        Deque queue=new ArrayDeque(  20 );
        StringBuilder strignNoPunctuation=new StringBuilder( 20 );
        StringBuilder stringInLowerCase=new StringBuilder( string.toLowerCase());

        for(int i=0;i<stringInLowerCase.length();i++){
            if (stringInLowerCase.charAt( i ) >= 'a' && stringInLowerCase.charAt( i ) <= 'z') {
              queue.add( stringInLowerCase.charAt( i ));
              strignNoPunctuation.append( stringInLowerCase.charAt( i ) );
              }
            }

            StringBuilder revString=new StringBuilder( queue.size() );
        while(!queue.isEmpty()){
            revString.append( queue.removeLast() );
        }

        return revString.toString().equals( strignNoPunctuation.toString() );
        }






}

