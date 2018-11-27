package SortAlgorithms_Challenges;

import java.util.Arrays;

public class DescendingMergeSort {

    public static void main(String[] args) {
        int[] arr= {20,35,-15,7,55,1,-22};

        descendingMergeSort(arr,0,arr.length);

        System.out.println( Arrays.toString(arr));
    }

    public static void descendingMergeSort(int[] arr, int start,int end){

        if(end-start<2){
            return ;
        }

        int mid=(start+end)/2;
        descendingMergeSort( arr,start,mid );
        descendingMergeSort( arr,mid,end );
        merge(arr,start,mid,end);
    }

    public static void merge(int[] arr, int start,int mid, int end){
        if(arr[mid-1]>=arr[mid]){
            return;
        }

        int i=start;
        int j=mid;
        int[] tempArray=new int[end-start];
        int tempArrayIndex=0;

        while(i<mid && j<end){
            tempArray[tempArrayIndex++]=arr[i]>=arr[j] ? arr[i++]:arr[j++];
        }
        System.arraycopy( arr,i ,arr,start+tempArrayIndex,mid-i);
        System.arraycopy( tempArray,0,arr,start,tempArrayIndex );
    }
}
