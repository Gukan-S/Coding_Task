//. Find distinct elements in an array
//Input: arr[] = {12, 10, 9, 45, 2, 10, 10, 45}
//Output: {12, 10, 9, 45, 2}

package Mettle;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class DistinctElement {
    public static void main(String[] args) {
        int[] arr = {12, 10, 9, 45, 2, 10, 10, 45};
        System.out.println(Arrays.toString(Original(arr)));
    }
    static int[] Distinct(int[] arr){
        int count=0;
        int[] nums=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            boolean Isduplicate=false;
            for (int j = 0; j < i ; j++) {
                if(arr[i]==arr[j]) {
                   Isduplicate=true;
                   break;
                    }
                }
            if(!Isduplicate){
                nums[count++]=arr[i];

            }
        }
        int[] result=new int[count];
        for (int i = 0; i < count; i++) {
            result[i]=nums[i];
        }
        return result;
    }
    static int[] Original(int[] arr){
        Set<Integer> S = new LinkedHashSet<>();
        for (int num: arr) {
            S.add(num);
        }
        int[] result=new int[S.size()];
                int count=0;
        for (int i:S) {
            result[count++]=i;

        }
        return  result;
    }
}
