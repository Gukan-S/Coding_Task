import java.util.Scanner;

public class Calculatehourminsec {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the days: ");
    int days=sc.nextInt();
    int hours = days * 24;
    int minutes = hours * 60;
    int seconds = minutes * 60;
    System.out.println(+hours+" hr "+minutes+" min "+seconds+" sec ");
  }
}
