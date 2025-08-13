package OOPS.Properties.Inheritance;

public class Bo {
    int w;
    int h;
    private int l;

//here any of the properties is mentioned as a private only used in this file but using super keyword we can access the variable in another file also


     Bo() {
        this.w = -1;
        this.h=-1;
        this.l=-1;
    }
    Bo(int w,int h,int l){
        this.w = w;
        this.h=h;
        this.l=l;
    }
}
