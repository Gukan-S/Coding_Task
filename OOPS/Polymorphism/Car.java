package OOPS.Polymorphism;

public class Car extends Vehicle {
    void speed(){
        System.out.println("top speed 120");
    }
}
//this method is called override same class name as parent and child but body of the child and parent is different
//this method is run when object is created to Lorry it is override the parent class