import java.util.*;
public class ArrayListExample {


  public static void main(String[] args) {
 ArrayList<Integer> list=new ArrayList<>(5);
//  list.add(3);
//  list.add(4);
//  list.add(5);
//  list.add(6);
//  System.out.println(list.contains(4));
//  System.out.println(list);
Scanner sc=new Scanner(System.in);
for(int i=0;i<5;i++){
  list.add(sc.nextInt());
}
for(int i=0;i<5;i++){
System.out.print(list.get(i)+" ");
}
sc.close();
  }
}

