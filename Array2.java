import java.util.Arrays;
import java.util.Scanner;

public class Array2 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int[] arr= new int[5];
    int[] name;

    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+"");
    }
    System.out.println();
    System.out.println(Arrays.toString(arr));
    sc.close();
  }
}
