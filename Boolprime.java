import java.util.*;
public class Boolprime {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(prime(n));
sc.close();
    }
    static boolean prime (int n){
   
        if(n<=1){
            return false;
        }
        int c=2;
        while (c*c<=n){
            if(n%c==0){
            return false;
        }
        c++;
      }
     
        return(c*c>n);
    }
}


