import java.util.Scanner;

public class Stringpattern {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=1;i<=n;i++){
      char let='a';
      for(int j=1;j<=i;j++){
        System.out.print(let++);
      }
      System.out.println("");
    }
    sc.close();
  }
}
// import java.util.Scanner;

// public class Stringpattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
        
//         for (int i = 1; i <= n; i++) {
//             char let = 'a';  // Reset let for each row
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(let++);
//             }
//             System.out.println();
//         }
        
//         sc.close();
//     }
// }
