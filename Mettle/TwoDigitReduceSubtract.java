public class TwoDigitReduceSubtract {
    public static void main(String[] args) {
        int n=5465;
        int sub=0,result=0,temp=0;
        while (n>10){
            int r1=n%10;
            int r2=(n%100)/10;
            temp=Math.abs(r1-r2);
            result=result*10+temp;
            n/=10;
        }
        n=result;
        result=0;
        while (n>10){
            int r3=n%10;
            int r4=(n%100)/10;
            temp=Math.abs(r3-r4);
            result=result*10+temp;
            n/=10;
        }
    System.out.println(result);
    }
}
