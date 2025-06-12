package Polymorphism.CompileTimePoly;

public class Intro2 extends Intro1{
    String UserName;
    String Email;
    String Password;
    Intro2(int erNo,String Password){
        super(erNo);
        this.Password=Password;
    }
    Intro2(String degreeType ,String Name, String LastName){
        Super(degreeType,Name,LastName);
    }
}
