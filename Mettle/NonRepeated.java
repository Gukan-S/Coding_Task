public class NonRepeated {
    public static void main(String[] args) {
        int n=1015;
        int[] arr=new int[10];
        int count=0;
        while(n!=0){
            int r=n%10;
            if(arr[r]==0){
                count++;
            }
            if(arr[r]==1){
                count--;
            }
            arr[r]++;
            n/=10;
        }
        System.out.println(count);
    }
}
