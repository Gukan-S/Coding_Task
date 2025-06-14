import java.util.Arrays;

public class Array2dLSearch {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},
                {9,18,5},{6,7,14}};
        System.out.println(Arrays.toString(Array2dSearch(arr,5) ));
    }
    static int[] Array2dSearch(int[][] arr , int target){
        for(int row=0;row< arr.length;row++){
            for(int col = 0; col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int []{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
