package SortAlgorithms_Challenges;

import java.util.Arrays;

public class RecurrantInsertionSort {


        public static void main(String[] args) {
            int[] arr= {20,35,-15,95,7,55,1,-22};

            recurrantInsertionSort(arr,0,arr.length);

            System.out.println( Arrays.toString(arr));
        }

        public static void recurrantInsertionSort(int[] arr,int start,int end){

            if(start==end){
                return;
            }
            recurrantInsertionSort( arr,start,end-1 );
            insert(arr,start,end-1);

        }
        public static void insert(int[] arr, int start,int end){

                int newElement=arr[end];
                int j=end;
                while(j>start  && newElement < arr[j-1]){
                    arr[j]=arr[j-1];
                    j--;
                }
                arr[j]=newElement;

        }
}
