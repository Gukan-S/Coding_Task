package OOPS.Statickey;

// the fun class is outside the iinerclass  so it would be a non-static
public class InnerClass {
    //now it depends on other class so make this class as Static
    // the neseted  classes are depended to each other but not depend on the parent class
    //it does not depended of object of the inner class the nested class are static
    //in static methods the object created the run time

    static class fun{ // now it's depend on the class not object so it will ot show any error while print in main
         String name;//if it is static variable it can be accessed by class name
    public fun(String name) {
            this.name = name;
        }
    }
    public static void main(String[] args) {
     fun obj =new fun("gukan");
     fun obj1=new fun("Rahul");
        System.out.println(obj.name);
        System.out.println(obj1.name);

    }
}
