package Mettle;

public class IspossiblePalindrome {
    public static void main(String[] args) {
        int n=25135;
        System.out.println(Possible(n));
    }

    static int Possible(int n){
    int[] arr=new int[10];
     while(n>0){
         int digit=n%10;
         arr[digit]++;
         n/=10;

    }
     int Oddcount=0;
     for(int count:arr){
         if(count%2!=0){
             Oddcount++;
         }
     }
     return (Oddcount<= 1)?2:1;
    }

}
