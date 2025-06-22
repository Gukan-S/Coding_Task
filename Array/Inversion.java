import java.util.Scanner;

public class Inversion {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    int count = 0;
    int i = 0;
    int j = 1;
    while (i < n) {
      if (j < n) {
        if (arr[i] > arr[j] && i < j) {
          count++;
        }
        j++;
      } else {
        i++;
        j = i + 1;

      }
    }
    System.out.println(count);
  }
}
