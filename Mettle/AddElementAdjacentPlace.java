//. Given an array arr[] of size n and an integer k, the task is to insert a duplicate of k
//adjacent to its every occurrence. Keep array's original length same by removing the
//elements from the back.
//Input: arr[] = [1, 0, 2, 3, 0, 4, 5, 0], K = 0
//Output: [1, 0, 0, 2, 3, 0, 0, 4]

package Mettle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddElementAdjacentPlace {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 2, 5, 0};
        int k = 2;
        System.out.println(Arrays.toString(AddElement(arr,k)));
    }
    static int[] AddElement(int[] arr,int k){
        List<Integer> l=new ArrayList<Integer>();
        for (int i :arr) {
            l.add(i);
            if(i==k){
                l.add(k);
            }
        }
        while (l.size()> arr.length){
            l.remove(l.size()-1);
        }
        int[] result=new int[arr.length];
        for (int i = 0; i < l.size() ; i++) {
            result[i]=l.get(i);
        }
        return result;
    }
}
