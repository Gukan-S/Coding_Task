public class MaxvalueinRange {
  public static void main(String[] args) {
    int[] arr={2,5,9,70,46,23};
    System.out.println(InRange(arr, 2, 4));
  }
  static int InRange(int[] num,int start,int end){
    int Maxval=num[start];
    for(int i=start;i<=end;i++){
      if(num[i]>Maxval)
      Maxval=num[i];
    }
    return Maxval;
  }
}
