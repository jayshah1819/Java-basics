package OOPsConcecpts.Polymorphism.CompileTimePoly;

public class Intro1 extends University{
    String Name;
    String LastName;
    int ErNo;

    Intro1(String degreeType ,String Name, String LastName){
        super(degreeType);//This is Inheritance
        this.Name=Name;
        this.LastName=LastName;
    }
    Intro1(int ErNo){
        this.ErNo=ErNo;

    }
    Intro1(){

    }



}
