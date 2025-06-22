import java.util.*;
public class Greetings {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number: ");
    int n=sc.nextInt();
    if (n%3==0 && n%4==0) {
      System.out.println("Good Morning");
    }
    else if(n%4==0){
      System.out.println("Good Afternoon");
    }
    else if(n%3==0){
      System.out.println("Good Evening");
    }
    else{
      System.out.println("Good Night");
    }
    sc.close();
  }
}
