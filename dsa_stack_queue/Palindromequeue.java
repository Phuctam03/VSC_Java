package dsa_stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Palindromequeue {

    // boolean pQueue(String str) {
    // Queue<Character> myQueue = new LinkedList<>();
    // for (int i = 0; i < str.length(); i++) {
    // myQueue.add(str.charAt(i));
    // }
    // for (int i = 0; i < str.length(); i++) {
    // System.out.println(myQueue.poll());
    // }
    // for (int i = str.length() - 1; i >= 0; i--) {
    // while (myQueue.poll() != null) {
    // if (myQueue.poll() == str.charAt(i)) {
    // return true;
    // }
    // }
    // }
    // return false;
    // }
    boolean isPalindrome(String s) {
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            queue.add(s.charAt(i));
        }
        for (int i = 0; i < s.length() / 2; i++) {
            if (queue.remove() != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Palindromequeue myQueque = new Palindromequeue();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String ");
        String str = sc.nextLine();
        if (myQueque.isPalindrome(str)) {
            System.out.println("This is Palindromequeue");
        } else {
            System.out.println("No");
        }

    }

}