public class MaxvalueinArray {
  public static void main(String[] args) {
    int[] arr={3,2,4,6,9,5};
    System.out.println(Max(arr));
  }
  static int Max(int[]num){
    int maxval=num[0];
    for(int i=1;i<num.length;i++){
      if(num[i]>maxval)
      maxval=num[i];
    }
return maxval;
  }
}
