package OOPsConcecpts;

public class ClassesAndMethods {
    public static void main(String[] args) {
        Student student1= new Student("jay",12,15);
        Student student2=new Student("ritu",22,20);
        Student student3=new Student();

        //now from the student1 we gave name and rnum and marks to it so we can print it but
        //the process is a bit lengthly so what can we do instead.
        //student1.name="jay";
        //student1.rnum=452;
        //student1.marks=44.5f;




        System.out.println(student1.rnum+", " +student3.marks+","+student3.name);

    }

}
