package SearchAlgorithms;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array={-22,1,-15,7,20,5,35};
        Arrays.sort(array);//// MOST IMPORTANT STEP
        System.out.println("The sorted array is : " + Arrays.toString( array ) );
        System.out.println("Value 20 in sorted array is at : " +binarySearch( array,0,array.length,20 ));
        System.out.println("Value 20 in sorted array is at : " +binarySearch( array,0,array.length,201 ));
    }

    public static int binarySearch(int[] array,int start,int end, int value){
        int mid=(start+end)/2;

        if(start>=end){
            return -1;
        }

        if(array[mid]==value){
            return mid;
        } else if(array[mid]>value){
            return binarySearch(array,start,mid,value);
        } else{
           return binarySearch( array,mid+1,end,value );
        }
    }
}
