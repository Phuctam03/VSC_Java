package dsa_sort;

import java.util.Arrays;
import java.util.Scanner;

public class MhinsertionSort {

    static void InsertioonSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int x = array[i], index = i - 1;
            while (index >= 0 && array[index] > x) {
                array[index + 1] = array[index];
                --index;
            }
            array[index + 1] = x;
            System.out.println("Bước :" + i + Arrays.toString(array));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter the elemets array ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Mảng Ban đầu :");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("Mảng sau khi được sắp xếp :");
        MhinsertionSort.InsertioonSort(a);

    }

}
