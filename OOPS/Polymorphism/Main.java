package OOPS.Polymorphism;

//the polymorphism is used to representing the same thing in multiple ways
//types of polymorphism 1.compile time polymorphism it is archived via method overloading



public class Main {
    public static void main(String[] args) {



        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        Lorry lorry = new Lorry();
//        Bike bike = new Bike();

//        lorry.speed();
Vehicle vehicle1=new Bike(); // parent obj=new child() here the method will called depend on the child java determines based on the dynamic method dispatch
// the type is parent but the object type is child so it will called the child
        //this is known as UPCASTING  this is overriding


vehicle1.speed();
    }
}
