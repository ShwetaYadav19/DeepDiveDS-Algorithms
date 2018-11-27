package SortAlgorithms;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {


        int[] arr = {20, 35, -15, 7, 55, 1,22};


        for(int i=1;i<arr.length;i++){
            int lastUnsortedNumber=arr[i];
            int j=i-1;
            for(;j>=0;j--){
                if(arr[j]>lastUnsortedNumber){
                    swap( arr,j,j+1 );
                }
                else {

                    break;
                }
            }

        }

        System.out.println( Arrays.toString(arr));
    }

    private static void swap(int[] arr, int i,int j ){
        if(i==j){
            return;
        }

        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
}


