package OOPS.Properties.Inheritance;

public class Inheritance {
    public static void main(String[] args) {
//Bo set=new Bo();// these method call the constructor which is created for the parent class
        AddWeight set =new AddWeight(2,4,6,8);// here this class extends from the parent class
        System.out.println(set.w+" "+set.h+ " "+set.weight);
//        System.out.println(set.l);//if it is private we canno access in the main method
    }
    // the child class can access the properties of the parent class ex:this.l=l;
    //but the parent class cannot access the child class properties ex:this.weight=weight;
}
