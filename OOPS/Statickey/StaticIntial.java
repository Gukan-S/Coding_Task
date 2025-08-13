package OOPS.Statickey;

public class StaticIntial {

        static int a=5;
        static int b;

        // it will run only once, when the first object is created
    // when the class is loaded for the first time if the second object is created but it doesn't run these

        static {
            System.out.println("hello world");
            b=a*a+5;
        }

    public static void main(String[] args) {
        StaticIntial obj=new StaticIntial();
        System.out.println(StaticIntial.a+" "+StaticIntial.b);

        b+=3;
        System.out.println(StaticIntial.a+" "+StaticIntial.b);
        StaticIntial obj2=new StaticIntial();
        System.out.println(StaticIntial.a+" "+StaticIntial.b);
    }
    }

