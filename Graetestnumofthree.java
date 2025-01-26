import java.util.*;
public class Graetestnumofthree {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("enter the a value:  ");
    int a=sc.nextInt();
    System.out.print("enter the b value:  ");
    int b=sc.nextInt();
    System.out.print("enter the c value:  ");
    int c=sc.nextInt();
    if(a>b && a>c){
      System.out.print("The  value of a " +a+ " is greater");
    }
    else if(b>a && b>c){
      System.out.println("the value of b " +b+ " is greater");
    }
    else{
      System.out.println("the value of c "+c+ " is greater");
    }
    sc.close();
    }
  }
