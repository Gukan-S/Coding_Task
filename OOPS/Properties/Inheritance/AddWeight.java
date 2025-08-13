package OOPS.Properties.Inheritance;

public class AddWeight extends Bo {// the extends keyword use to get the properies of parent class to child class
    int weight;

    public AddWeight(int weight) {
        this.weight = weight;
    }

    public AddWeight(int w, int h, int l, int weight) {
        super(w, h, l);// call the parent class constructor it is used intialise the value present in the parent class
        this.weight = weight;
    }
    //super(); is the object class it is used to access the parent class directly if te child have the same variable name as a parent use super.var name it only access from the parent class
}
