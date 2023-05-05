package dsa_sort;

import java.util.Scanner;

public class InsertionSort {

    int[] InsertioonSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int x = array[i], index = i - 1;
            while (index >= 0 && array[index] > x) {
                array[index + 1] = array[index];
                --index;
            }
            array[index + 1] = x;
            
        }
        return array;

    }

    public static void main(String[] args) {
        InsertionSort sort = new InsertionSort();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enther the number ");
        int n = sc.nextInt();
        System.out.println("Enther the array elements");
        int array[] = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int array2[] = sort.InsertioonSort(array);
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
    }

}
