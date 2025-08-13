package OOPS.Singleton;

public class Singleton2 {
    public static void main(String[] args) {
Singleton obj=Singleton.getInstance(); // whenevr accesc the methods via class name the method should be static
        Singleton obj1=Singleton.getInstance();
        Singleton obj2=Singleton.getInstance();
// all three refernce variable is point to just one object
    }
}
