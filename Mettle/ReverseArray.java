//. Reverse an Array
//Input: arr = [4, 5, 2]
//Output: [2, 5, 4]

package Mettle;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={4,5,2};
        int[] reverse=new int[arr.length];
        for (int i =0; i < arr.length; i++) {
            reverse[arr.length-i-1]=arr[i];
        }
        System.out.println(Arrays.toString(reverse));
    }
}
