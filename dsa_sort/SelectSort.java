package dsa_sort;

import java.util.Scanner;

public class SelectSort {

    int[] selectSort(int[] arrray) {
        for (int i = 0; i < arrray.length - 1; i++) {
            for (int j = i + 1; j < arrray.length; j++) {
                if (arrray[i] > arrray[j]) {
                    int min = arrray[i];
                    arrray[i] = arrray[j];
                    arrray[j] = min;

                }
            }
        }
        return arrray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SelectSort sort = new SelectSort();
        System.out.println("Enter the number :");
        int n = sc.nextInt();

        System.out.println("enter the elements array :");

        int array[] = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int array2[] = sort.selectSort(array);

        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }

    }

}
