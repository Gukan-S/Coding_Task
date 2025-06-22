

public class Amstrong {
  public static void main(String[] args) {
    // Scanner sc=new Scanner(System.in);
    // int n=sc.nextInt();
    // // isAmstrong(n);
    for(int i=100;i<=1000;i++){
      if (isAmstrong(i)) {
        System.out.println(i+" ");
      }
    }
    
  }
  static boolean isAmstrong(int n){
    int sum=0;
    int org=n;
    while (n!=0) {
    
      int rem=n%10;
      int cube=rem*rem*rem;
      sum+=cube;
      n=n/10;
    }
return(sum==org);
  }
}
