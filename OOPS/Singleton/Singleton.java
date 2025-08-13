package OOPS.Singleton;

public class Singleton {
    private Singleton(){ // constructor which is for the user cannot access

    }
    private static Singleton insatance;// create a instance and make it static because using this instance we can access more instance

    public static Singleton getInstance(){
        // check if only one object is create if it is null create a new one
        // if it is already created just return the same object for all the instance

        if(insatance ==null){
            insatance = new Singleton();
        }
        return insatance;
    }
}
