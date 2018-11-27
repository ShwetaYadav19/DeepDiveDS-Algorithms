package SortAlgorithms;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr={23,56,12,-10,11,26,3};

        for(int j=6;j>0;j--){
            for(int i=0;i<j;i++){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i+1];
                    arr[i+1]=arr[i];
                    arr[i]=temp;
                }
            }
        }


        for(int i=0;i<7;i++){
            System.out.println(arr[i]);
        }
    }
}
