import java.util.Scanner;

public class Vowelsorcons {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    char vowels=sc.next().charAt(0);
    switch (vowels) {
      case'a': case'A':
        System.out.println(vowels+" is vowel");
        break;
        case'e':case'E':
        System.out.println(vowels+" is vowel");
        break;
        case'i':case'I':
        System.out.println(vowels+" is vowel");
        break;
        case'o':case'O':
        System.out.println(vowels+" is vowel");
        break;case'u':case'U':
        System.out.println(vowels+" is vowel");
        break;
      default:
      System.out.println(vowels+" is consonats");
        break;
    }
    sc.close();
  }
}
