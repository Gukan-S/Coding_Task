//Find common elements between 2 arrays.
//        Input : a[] = {1, 2, 1, 3, 1}, b[] = {3, 1, 3, 4, 1}
//Output : {1, 3, 1}

package Mettle;

import java.util.LinkedHashSet;
import java.util.Set;

public class CommonElement {
    public static void main(String[] args) {
       int[] a = {1, 2, 1, 3, 1};
       int[] b = {3, 1, 3, 4, 1};
       CommonElement(a,b);
    }
    static void CommonElement(int[] a, int[] b){
        Set<Integer> s1=new LinkedHashSet<>();
        Set<Integer> s2=new LinkedHashSet<>();
        for(int i:a){
            s1.add(i);
        }
        for(int j:b){
            s2.add(j);
        }
        s1.retainAll(s2);
        System.out.println(s1);

    }

}
