package OOPS.Polymorphism;

public class methodOverloading {
        int sum(int a,int b){
            return a+b;
        }
        int sum(int a,int b,int c){
            return a+b+c;
        }

    public static void main(String[] args) {
            methodOverloading mo=new methodOverloading();
        mo.sum(10,20);
        System.out.println(mo.sum(10,20,30));

    }
}
//same method name but different parameters , datatypes , order change via archive the method overloading