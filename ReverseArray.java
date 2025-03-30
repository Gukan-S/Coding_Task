import java.util.Arrays;

public class ReverseArray {
  public static void main(String[] args) {
    int[] arr={1,5,9,2,8,7};
    reverse(arr);
    System.out.println(Arrays.toString(arr));
  }
  static void reverse(int[] num){
    int start=0;
    int end=num.length-1;

    while (start<end) {
     Swap(num, start, end);
     start++;
     end--;
    }
  }
  static void Swap(int[] arr,int index1,int index2) {
    int temp=arr[index1];
    arr[index1]=arr[index2];
    arr[index2]=temp;

  }

}
