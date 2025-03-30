import java.util.Arrays;

public class Method {
  public static void main(String[] args) {
    int [] arr={1,4,5,6,7};
    fucntion(arr);
    System.out.println(Arrays.toString(arr) );
  }
  static void fucntion(int [] nums){
    nums[0]=99;
  }
}
