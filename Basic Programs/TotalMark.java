import java.util.Scanner;

public class TotalMark {
  public static void main(String[] args) {
     int total_mark=0;
  Scanner scanner=new Scanner(System.in);
System.out.println("enter the 5 subject marks:");
for(int i=1;i<=5;i++){
System.out.print("subject "+i+" :");
total_mark+=scanner.nextInt();

}
double percentage=total_mark/5.0;
System.out.println("Total mark: "+total_mark);
System.out.println("Percentage: "+percentage+ "%");
scanner.close();
  }
}
