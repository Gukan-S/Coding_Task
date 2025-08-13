package OOPS.Polymorphism;

public class Lorry extends Vehicle {


    @Override //this is anotation it is used to check the method is override the method which is in parent class or not


    void speed(){
        System.out.println("top speed 80");
    }
}
//this method is called override same class name as parent and child but body of the child and parent is different
//this method is run when object is created to Lorry it is override the parent class
// it is runtime polymorphism


