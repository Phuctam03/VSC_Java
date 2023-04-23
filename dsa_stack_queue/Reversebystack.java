package dsa_stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class Reversebystack {
    public static void main(String[] args) {
        Stack<Integer> mystack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int arr[], n;
        System.out.println("Enter amount Array :");
        n = Integer.parseInt(sc.nextLine());
        System.out.println("Enter each elements in array :");
        arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            mystack.push(arr[i]);
        }
        System.out.println("Out put array :");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(mystack.pop());
        }
        System.out.println("Số lượng stacks :" + mystack.size());
        sc.close();
    }

}