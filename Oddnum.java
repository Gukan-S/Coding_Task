public class Oddnum {
  public static void main(String[] args) {
    int num=5;
    int range=30;
    while (num<range) {
    num++;
    if(isodd(num)==false) {
      continue;
    }
    System.out.println(num);
  }
}
  public static boolean isodd(int num){
    if(num%2!=0)
    return true;
    else{
    return false;
    }}

}
