package SortAlgorithms;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22,-5};

  mergeSort( arr,0,arr.length );
        System.out.println(Arrays.toString(arr));


    }

    public  static void mergeSort(int[] arr,int start,int end){

        if( end-start < 2){
            return;
        }

        int mid=(start+end)/2 ;

        mergeSort( arr,start,mid );
        mergeSort( arr,mid,end );
        merge(arr,start,mid,end);

    }

    public static void merge(int[] arr, int start,int mid,int end){
/*

        if(arr[mid-1]<=arr[mid]){
            return;
        }
*/

        int[] tempArray=new int[end-start];
        int i=start;
        int j=mid;
        int tempIndex=0;

        while(i<mid && j<end) {
           tempArray[tempIndex++] = arr[i] <= arr[j] ? arr[i++] :arr[j++] ;

        }

     System.arraycopy( arr,i,arr,start+tempIndex ,mid-i);
        System.arraycopy( tempArray,0,arr,start,tempIndex );





    }
}
