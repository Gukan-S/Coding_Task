//. Re-arranged array by small – largest combination
//Input: [1, 3, 5, 2, 8, 7, 4]
//Output:[1, 8, 2, 7, 3, 5, 4]

package Mettle;

import java.util.Arrays;

public class SmallLargeCombo {
    public static void main(String[] args) {
        int[] arr={1,3,5,2,8,7,4};
        Arrays.sort(arr);
        int min=0;
        int max= arr.length-1;
        int[] nums=new int[arr.length];
        for(int i=0;i< arr.length;i++){
            if(i%2==0){

                nums[i]=arr[min++];
            }
            else{

                    nums[i]=arr[max--];
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
