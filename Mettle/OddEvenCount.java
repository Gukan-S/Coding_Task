public class OddEvenCount {
    public static void main(String[] args) {
        int oddcount=0,evencount=0;
        int n=53467;
        while (n!=0){
            int r=n%10;
            if(r%2==0){
                evencount++;
            }
            else{
                oddcount++;
            }
            n=n/10;
        }
        System.out.println("Even Count: "+evencount);
        System.out.println("Odd Count: "+oddcount);
    }
}
