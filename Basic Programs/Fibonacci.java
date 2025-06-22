import java.util.Scanner; 
public class Fibonacci{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter value of n: ");
int n=sc.nextInt();
sc.close();
int a=0,b=1,c;
for(int i=0;i<=n;i++) 
{
System.out.print(a + " ");
c=a+b;
a=b;
b=c;
}
}
}