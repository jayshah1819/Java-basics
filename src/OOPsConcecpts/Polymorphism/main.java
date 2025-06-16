package OOPsConcecpts.Polymorphism;

public class main {
    public static void main(String[] args){
        rectangle rect=new rectangle();
        shapes sh=new square();// if i have parent obj =new child const() ---> it should show us the method of child but wheb u am writng static it is showing
        //method of shapes why this is happening if we dont write static it wont happen so static can change the
        //using if we use static we cannot override the method in simple terms I would say
        square sq=new square();
        Triangle tr=new Triangle();



        sh.sides();// if we dont write static method this java will call circle's method

    }
}
