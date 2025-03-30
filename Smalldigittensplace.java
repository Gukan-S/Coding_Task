public class Smalldigittensplace {
  public static void main(String[] args) {
      int a = 3541, b = 2452, c = 3512, d, e;
      
      while (a != 0 || b != 0 || c != 0) {
          int tempA = a % 1000; // Extract last three digits
          int tempB = b % 1000;
          int tempC = c % 1000;
          
          d = Math.min(tempA, Math.min(tempB, tempC)); // Find the minimum of three
          System.out.println(d);
          
          a /= 1000; // Reduce the number
          b /= 1000;
          c /= 1000;
      }
  }
}
