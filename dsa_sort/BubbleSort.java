package dsa_sort;

import java.util.Scanner;

public class BubbleSort {

    int[] BubbleeSort(int[] array) {
        for (int i = 0; i < array.length  ; i++) {
            for (int j = i  ; j < array.length - i - 1   ; j++) {
                if (array[j] > array[j + 1 ]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j + 1 ] = temp;
                }

            }
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BubbleSort sort = new BubbleSort();

        System.out.println("Enter the number :");
        int n = sc.nextInt();
        System.out.println("Enter the elements array :");
        int array[] = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int array2[] = sort.BubbleeSort(array);
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }

    }

}
