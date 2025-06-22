public class Deciamlpart {
  public static void main(String[] args) {
    System.out.println(fivedecimalplace(1.723451,1.723452, 1.723453));
    
  }
  public static boolean fivedecimalplace(double num1,double num2,double num3) {
    num1=Math.round(num1*100000);
    num2=Math.round(num2*100000);
    num3=Math.round(num3*100000);
    if((num1==num2)&&(num2==num3)){
      return true;
    }
    else{
      return false;
    }
  }
}
