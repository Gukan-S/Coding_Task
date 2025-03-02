public class Lastdigitcheck {
  public static void main(String[] args) {
    System.out.println(lastdigit(41, 22, 71));
    System.out.println(lastdigit(23, 35, 42));
    System.out.println(lastdigit(9, 99, 999));
  }
  public static boolean lastdigit(int a,int b,int c){
    if (a<9||a>1000||b<9||b>1000||c<9||c>1000) 
      return false;
    int num1=a%10;
    int num2=b%10;
    int num3=c%10;
    if (num1==num2||num1==num3||num2==num3) {
      return true;
    }
    else{
      return false;
    }
  }
}
