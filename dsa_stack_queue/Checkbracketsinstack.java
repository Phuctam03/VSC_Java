package dsa_stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class Checkbracketsinstack {

    boolean checkBracket(Stack<Character> mystack, String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{') {
                mystack.push(str.charAt(i));
            } else if (str.charAt(i) == ')' || str.charAt(i) == ']' || str.charAt(i) == '}') {
                if (mystack.empty()) {
                    return false;
                } else if (!mystack.empty()) {
                    mystack.pop();
                }
            }

        }
        if (mystack.empty()) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Checkbracketsinstack myCheck = new Checkbracketsinstack();

        System.out.println("Enter a string ");
        String str;
        Stack<Character> test = new Stack<Character>();
        do {
            str = sc.nextLine();
            if (myCheck.checkBracket(test, str)) {
                System.out.println("successfully");
            } else {
                System.out.println("Bad");
            }
        } while (true);
    }

}
