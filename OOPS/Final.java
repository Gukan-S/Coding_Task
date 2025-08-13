package OOPS;

public class Final {
    public static void main(String[] args) {

//here we didn't use any primitive data types . the change is not a primitive data type so we can modify the values .

final A change=new A("Rahul");
        System.out.println(change.name);
change.name="Gukan";
        System.out.println(change.name);

//when a non primitive is final .we can modify the values but unable to re-assign the value like
//name="Avni";
//        System.out.println(change.name);
    }
}
class A{
    //in primitive using final keyword unable to made a change in it there is no way to change
    final int num =10;
String name;

    A(String name){
        this.name=name;
    }
}
