package OOPS;

public class ClassObject {
    public static void main(String[] args) {
        Student gukan = new Student();
        gukan.greeting();
        gukan.changename("rahul");
        gukan.greeting();
        Student rahul =new Student(13,"gukan",88.6f);
        System.out.println(rahul.name);
        System.out.println(rahul.rno);
        System.out.println(rahul.mark);
        System.out.println(gukan.mark);
        System.out.println(gukan.rno);
        System.out.println(gukan.name);
        Student random=new Student(rahul);
        System.out.println(random.name);
        Student random2=new Student();
        System.out.println(random2.name);
    }
}

    class Student {
        int rno;
        String name;
        float mark;
void greeting(){
    System.out.println("hello my name is "+name);
}
void changename(String myname){
    name=myname;
}
        Student(){
    this(13,"Avni",99.9f);
        }
        Student(Student other){
            this.rno=other.rno;
            this.name=other.name;
            this.mark=other.mark;
        }
//        Student() {
//            this.rno=15;
//            this.name="Rahul";
//            this.mark=93.4f;
//        }
        Student(int rollno,String name,float marks){
    this.rno=rollno;
    this.name=name;
    this.mark=marks;
        }
    }

