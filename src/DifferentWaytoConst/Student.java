package DifferentWaytoConst;

public class Student {
    String name;
    int rnum;
    float marks;
    Student(){
        this("jay",12,55.5f);
    }

    Student(String name, int rnum,float marks){
        this.name=name;
        this.rnum=rnum;
        this.marks=marks;
    }

}
