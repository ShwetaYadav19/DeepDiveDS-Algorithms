package SortAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BucketSort {
    public static void main(String[] args) {
        int[] array={54,46,83,66,95,92,43};

        bucketSort(array);
        System.out.println( Arrays.toString(array));
    }

    private static void bucketSort(int[] array) {

        List<Integer>[] bucketArray=new List[10];

        for(int i=0;i<bucketArray.length;i++){
             bucketArray[i]=new ArrayList<Integer>(  );
        }


        for(int i=0;i<array.length;i++){
          bucketArray[hash( array[i] )].add( array[i] );
        }
        for(List buckets:bucketArray){
            Collections.sort( buckets );
        }
        int j=0;
        for(int i=0;i<bucketArray.length;i++){
            for(int value:bucketArray[i]){
                array[j++]=value;
            }
        }

    }

    public static int hash(int value){
        return value/(int)10%10;
    }
}
