//Given an array of integers nums and an integer target, return indices of the two
//numbers such that they add up to target.
//Input: arr[] = [0, -1, 2, -3, 1], target = -2
//Output: 3 4

package Mettle;

import java.util.Arrays;

public class AddUpTheElement {
    public static void main(String[] args) {
         int[] arr = {0, -1, 2, -3, 1};
         int target = -2;
        System.out.println(Arrays.toString(FindTarget(arr,target)));
    }
    static int[] FindTarget(int[] arr,int target){
        int[] result=new int[2];
        for(int i=0;i< arr.length;i++){
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i]+arr[j]==target){
                    result[0]=i;
                    result[0+1]=j;
                    return result;
                }

            }
        }
        return new int[]{-1,-1};
    }
}
