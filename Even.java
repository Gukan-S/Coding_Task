public class Even {
  public static void main(String[] args) {
    System.out.println(sumeven(1,100));
    System.out.println(sumeven(-1,100));
    System.out.println(sumeven(10,10));
  }
  public static boolean iseven(int num){
   if(num<0)
   return false;
   if(num%2==0)
   return true;
   return false;
    
  }
  public static int sumeven(int start,int end){
    if (end<start) 
      return -1;
    
   if (start<=0|| end<=0) 
    return -1;
   
   int sum=0;
   for(int i=start;i<=end;i++){
    if(iseven(i))
    sum+=i;
   }
   return sum;
    }
    
  }


