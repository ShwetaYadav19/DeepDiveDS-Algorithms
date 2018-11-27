package SortAlgorithms;

import java.util.Arrays;

public class ShellSort {

    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22,-5};

        int gap = arr.length / 2;
        while (gap >=1) {
            for (int i = gap; i < arr.length; i++) {
                int newElement = arr[i];
                int j = i ;
                for (;  j-gap>=0 && arr[j-gap]>newElement ; j = j - gap) {

                        arr[j ] = arr[j-gap];

                }
                arr[j] = newElement;
            }
            gap=gap/2;
        }

        System.out.println( Arrays.toString(arr));
    }


}
