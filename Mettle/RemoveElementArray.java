//. Delete an element from an array
//Input: arr[] = [10, 20, 30, 40], pos = 2
//Output: [10, 30, 40]


        package Mettle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveElementArray {
    public static void main(String[] args) {
        Integer [] arr={10,20,30,40};
        List<Integer> l=new ArrayList<Integer>(Arrays.asList(arr));
        l.remove(1);
        Integer[] nums=l.toArray(new Integer[0]);
        System.out.println(Arrays.toString(nums));
    }
}
