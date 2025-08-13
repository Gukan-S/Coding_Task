package OOPS.Statickey;

public class Human {
    int age;
    String name;
    boolean married;
    static int population;

    public Human(int age,String name,boolean married) {
        this.age = age;
        this.name=name;
        this.married=married;
        Human.population+=1;// here using class name Human for reference because it is static
//        this.population+=1;//here use this key word for refernce of the population which is present in human class BUT It show the warning

    }



}
