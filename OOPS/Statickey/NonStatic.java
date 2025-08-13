package OOPS.Statickey;

// when we create a method without static it cannot accessed by the static method.
// the static method not depend on objects
// but non-static is depend on the objects
//non-static member can access the static member
// without create the object of the non-static we cannot access it in the static method
//this keyword cannot be used in the static because this is depend on the object




public class NonStatic {
    public static void main(String[] args) {
fun();
    }
    //greeting();
    static void fun(){

        //here call the non-ststic method but we cannot access it because it requires instances


        //without create the object of the class we cannot access the non-static in the static method
        NonStatic obj=new NonStatic();
        obj.greeting();
    }
    void greeting(){
        System.out.println("hello world");
    }
}
