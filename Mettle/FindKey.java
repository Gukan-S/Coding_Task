//FIND KEY:
//You are provided with 3 numbers input1,input2,input3.
//Each of these are four digit numbers within the range >=1000 and <=9999
//i.e
//1000<=input1<=9999
//        1000<=input2<=9999
//        1000<=input3<=9999
//you are expected to find the key using the below formula
//Key=[smallest digit in the thousands place of all three numbers][LARGEST digit in
//the hundreds place of all the three numbers]
//        [smallest digit in the tens place of all three numbers][LARGEST digit in the units
//place of all three numbers]
//        for e.g if input1=3521,input2=2452,input3=1352,then Key=[1][5][2][2]=1522
//Assuming that the 3 numbers are passed to the given function.Complete the
//function to find and return the key

package Mettle;

public class FindKey {
    public static void main(String[] args) {
        int a=3521;
        int b=2452;
        int c=1352;
      int[] arr={a,b,c};
      int thmin=Integer.MAX_VALUE,hmax=Integer.MIN_VALUE,tmin=Integer.MAX_VALUE,umax=Integer.MIN_VALUE;
      for(int i:arr){
          int th=(i/1000)%10;
          int h=(i/100)%10;
          int t=(i/10)%10;
          int u=i%10;
          thmin=Math.min(thmin,th);
          hmax=Math.max(hmax,h);
          tmin=Math.min(thmin,t);
          umax=Math.max(umax,u);
      }
      int key=thmin*1000+hmax*100+tmin*10+umax;
        System.out.println(key);
    }
}
