//Insert an element in an array
//Input: arr[] = [10, 20, 30, 40], pos = 3, ele = 50
//Output: [10, 20, 50,30, 40]

package Mettle;

import java.util.Arrays;

public class InsertElement {
    public static void main(String[] args) {
        int[] arr={10,20,30,40};

        int[] newArr = new int[arr.length + 1];
        System.arraycopy(arr, 0, newArr, 0, 2);
        newArr[2] = 50;
        System.arraycopy(arr, 2, newArr, 2 + 1, arr.length - 2);

        System.out.println(Arrays.toString(newArr));
    }
}
