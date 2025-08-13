//Given an integer array using searching element place the incremented number
//next to searching number
//Input = {10,20,10,30,14,40,60,10}
//Search=10
//Output={10,1,20,10,2,30,14,40,60,10,3}

package Mettle;

import java.util.*;

public class SearchElement {
    public static void main(String[] args) {
        Integer[] arr={10,20,10,30,14,40,60,10};
        int target=10;
        System.out.println(Arrays.toString(Search(arr,target)));
    }
    static int[] Search(Integer[] arr,int target){
        int count=1;
        List<Integer> l=new ArrayList<>();
        for (int i = 0; i <=arr.length-1 ; i++) {
            l.add(arr[i]);
            if(arr[i]==target){
              l.add(count++);
            }
        }
        int[] search= new int[l.size()];
        for (int i = 0; i < l.size() ; i++) {
            search[i] =l.get(i);
        }
        return search;
    }
}
