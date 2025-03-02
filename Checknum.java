import java.util.Scanner;
public class Checknum {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    printnumbers(x);
    sc.close();
  }
  public static void printnumbers(int x) {
    
    switch (x) {
      case 0:
        System.out.println("it is "+x);
        break;
        case 1:
        System.out.println("it is "+x);
        break;
        case 2:
        System.out.println("it is "+x);
        break;
        case 3:
        System.out.println("it is "+x);
        break;
        case 4:
        System.out.println("it is "+x);
        break;
        case 5:
        System.out.println("it is "+x);
        break;
        case 6:
        System.out.println("it is "+x);
        break;
        case 7:
        System.out.println("it is "+x);
        break;
        case 8:
        System.out.println("it is "+x);
        break;
        case 9:
        System.out.println("it is "+x);
        break;
      default:
      System.out.println("it is other");
        break;
    }
  }
}
