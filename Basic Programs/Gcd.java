// 
public class Gcd{

  public static int getGreatestCommonDivisor(int num1, int num2) {
    if (num1 < 10 || num2 < 10) {
        return -1;  // Invalid input
    }
    while (num2 != 0) {
        int remainder = num1 % num2;
        num1 = num2;
        num2 = remainder;
    }
    return num1;
}

  public static void main(String[] args){
      System.out.println(getGreatestCommonDivisor(25, 15));
      System.out.println(getGreatestCommonDivisor(12, 30));
      System.out.println(getGreatestCommonDivisor(9, 18));
      System.out.println(getGreatestCommonDivisor(81, 153));
  }
}