public class MagicNo {
    public static void main(String[] args) {
        int a=50113,d,sum=0,t=a;
        while (a!=0){
            d=a%10;
            sum+=d;
            a/=10;
            if(sum>=10&&a==0){
                a=sum;
                sum=0;
            }
        }
        if(sum==1){
            System.out.println(t+" Magic");
        }
        else{
            System.out.println(t+" not Magic");
        }
    }
}
