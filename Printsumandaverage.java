import java.util.Scanner;


public class Printsumandaverage {
    public static void main(String[] args) {
        thePrintSumAndAverage();
    }

    public static void thePrintSumAndAverage() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        long avg = 0; 

        while (sc.hasNextInt()) { 
            int n = sc.nextInt();
            sum += n;
            count++;
        }

        if (count == 0) {
            System.out.println("SUM = 0 AVG = 0");
        } else {
            avg = sum / count;
            System.out.println("SUM = " + sum + " AVG = " + avg);
        }

        sc.close();
    }
}

