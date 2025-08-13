//Remove all duplicates in an array sample input and output
//Input:[1, 2, 2, 3, 4, 4, 5]
//Output:[1, 2, 3, 4, 5]

package Mettle;

import java.util.LinkedHashSet;

public class Dupilcate {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,4,5};
        Duplicate(arr);
    }
    static void Duplicate(int[] arr){
        LinkedHashSet<Integer> s = new LinkedHashSet<Integer>();
        for (int i:arr){
            s.add(i);
        }
        System.out.println(s);
    }
}
