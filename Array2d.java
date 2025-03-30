import java.util.Arrays;
import java.util.Scanner;

public class Array2d {
  public static void main(String[] args){
    int[][] arr=new int[3][3];//(decalaration) the first one is row and the second one is coloumn 2nd is not mandatory to give
     int[][] arr2d={{1,2,3},//0th index
     {4,5,6},//1th index
     {7,8,9}//2nd index
    };//(initilaization) this id array of array
    System.out.println(arr.length);//it print the row value
    Scanner sc=new Scanner(System.in);
    for(int row =0;row<arr.length;row++){
      for(int col=0;col<arr[row].length;col++){
      arr[row][col]=sc.nextInt();
    }
}
for(int row =0;row<arr.length;row++){
  for(int col=0;col<arr[row].length;col++){
 System.out.print(arr[row][col]+" ");
}
System.out.println();
  }
  for(int row =0;row<arr.length;row++){
    System.out.println(Arrays.toString(arr[row]));
  }
  System.out.println(" ");
  for(int[] a:arr){
    System.out.println(Arrays.toString(a));
  }
  sc.close();
}
}

