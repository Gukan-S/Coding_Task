
public class Sumfirstandlast {
  public static void main(String[] args) {
    
    System.out.println(sumfirstlast(354));
    System.out.println(sumfirstlast(-1));
  }
  public static int sumfirstlast(int num){
    if(num<0)
    return -1;
    int first;
    int last=num%10;
    first=num;
  while (first>=10) {
    first=first/10;
  }
  return first+last;
}
}