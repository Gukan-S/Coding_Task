package Sorting_Algorithm;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={-1,0,9,-4,7,10};
        Sorting(arr);
        System.out.println(Arrays.toString (arr));
    }
    static void Sorting(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int max=getMax(arr,0,last);
            swap(arr,max,last);

        }
    }
    static void swap(int[] arr,int first,int last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
    static int getMax(int arr[],int first,int last){
        int max=first;
        for(int i=first;i<=last;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
}
