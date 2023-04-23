package dsa_stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class Binarytodecimal {
    public static void main(String[] args) {
        Stack<Integer> ms = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number decimal :");
        n = sc.nextInt();
        while (n > 0) {
            int sodu = n % 2;
            ms.push(sodu);
            n = n / 2;
        }
        System.out.println("binary to demacial :");
        int length = ms.size();
        for (int i = 0; i < length; i++) {
            System.out.print(ms.pop());
        }

    }

}
