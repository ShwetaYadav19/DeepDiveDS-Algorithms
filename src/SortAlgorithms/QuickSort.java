package SortAlgorithms;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr={20, 35, -15, 7, 55, 1, -22,-5};

        quickSort(arr,0,arr.length);
        System.out.println( Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int start,int end){

       if(end-start<2) {
           return;
       }
           int pivotIndex = partition( arr, start, end );
           quickSort( arr, start, pivotIndex  );
           quickSort( arr, pivotIndex+1 , end );


    }

    public static int partition(int[] arr,int start,int end){
        int pivot =arr[start];
        int i=start;
        int j=end;

        while(i<j){

          while(i<j && arr[--j]>=pivot);
          if(i<j){
              arr[i]=arr[j];
          }

          while(i<j && arr[++i]<=pivot);
          if(i<j){
              arr[j]=arr[i];
          }


        }

        arr[j]=pivot;
        return j; //logic to return j is coz we are starting from j on rigth j will give pivot index
        //return i if u start from i on left and see your pivot will be at ith position
    }
}
