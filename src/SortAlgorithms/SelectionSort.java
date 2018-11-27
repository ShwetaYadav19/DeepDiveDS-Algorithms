package SortAlgorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr={20,35,-15,7,55,1,-22};
        for(int i=arr.length-1;i>=0;i--){
            int max=arr[0];
            int maxIndex=0;
            for(int j=1;j<i+1;j++){
                if(arr[j]>max){
                    max=arr[j];
                    maxIndex=j;
                }
            }
            swap(arr,i,maxIndex);
        }

        System.out.println(Arrays.toString( arr ));

    }

    private static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
