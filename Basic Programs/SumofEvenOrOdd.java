public class SumofEvenOrOdd {
    public static void main(String[] args) {
        int input1=2134;
        String input2="even";
        int sum=0;
        while(input1!=0){
            if(input2=="odd"){
                int r=input1%10;
                if(r%2!=0){
                    sum+=r;
                }
            }
            if(input2=="even"){
                int r=input1%10;
                if(input1%2==0){
                    sum+=r;
                }
            }
            input1/=10;
        }
        System.out.println(sum);
    }
}
