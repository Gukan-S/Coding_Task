public class Dosum {
  public static void main(String[] args) {
    int n=456734567;
    int sum=0;
    int rem;
    do{
      rem=n%10;
      sum+=rem;
      n/=10;
      }while(n!=0);{
        System.out.println(sum);
      }
    }
  }

