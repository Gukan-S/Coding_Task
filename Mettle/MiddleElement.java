//Middle Element in an array.
//        Input: arr = {1, 2, 3, 4, 5}
//Output: 3

package Mettle;

public class MiddleElement {
    public static void main(String[] args) {
        int[] arr={7,8,9,10,11,12,7};
        int mid= arr.length/2;
       if(arr.length%2!=0){

           System.out.println(arr[mid]);
       }
       else {
           System.out.println(arr[mid-1]+ " "+ arr[mid]);
       }
    }
}
