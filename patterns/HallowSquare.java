package patterns;

import java.util.Scanner;

public class HallowSquare {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        for(int i =0;i<=n;i++){
            for(int j=0;j<=n;j++){
                if(i==0){
                    System.out.println("*");
                } else if (i==n) {
                    System.out.println("*");

                }
                else {
                    System.out.println(" ");
                }
            }

        }
        sc.close();
    }
}