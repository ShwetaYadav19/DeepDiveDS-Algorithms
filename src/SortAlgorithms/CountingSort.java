package SortAlgorithms;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr={2,5,9,8,2,8,7,10,4,3};
        countingSort( arr );
        System.out.println( Arrays.toString(arr));


    }

    public static void countingSort(int[] arr){
        int[] countArray=new int[arr.length];

        for (int i=0;i<arr.length;i++){
            countArray[arr[i]-1]++;
        }
        int k=0;
        for(int i=0;i<countArray.length;i++){

            if(countArray[i] !=0){
                for(int j=0;j<countArray[i];j++){
                    arr[k]=i+1;
                    k++;
                }
            }
        }
        }
}
