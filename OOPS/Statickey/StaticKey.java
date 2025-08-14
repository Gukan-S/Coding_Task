package OOPS.Statickey;

// the static variable is no need to create the  object without object we can access the static variable use class name as reference

//the main method is static why? because without create a object for the main method we can do the operations so we use the static .
//static belongs to the class not a object
// the static method not depend on objects
// but non-static is depend on the objects
//the static method cannot override the eg:create method in parent and same method craete in child in main method craete the object
// and call the method using child  object also it will the call the method which is present in the parent
//why because the override method depends on the object but the static method depends on the class 

public class StaticKey {
    public static void main(String[] args) {
        Human a = new Human(18, "Gukan", true);
        Human b = new Human(21, "Rahul", false);

        // here using the object for the refernce to print the static variable
        // population it will print but it is not a correct
        // way to access the static variable like{ System.out.println(a.population);}

        // instead of using the object for the reference we must use the class name to
        // access the static variable
        // like { System.out.println(Human.population);}

        System.out.println(Human.population);
        System.out.println(Human.population);
    }
}
