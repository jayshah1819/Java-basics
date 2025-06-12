package Polymorphism.CompileTimePoly;

public class Intro2 extends Intro1{
    String UserName;
    String Email;
    String Password;
    Intro2(int erNo,String Password){
        super(erNo);
        this.Password=Password;
    }
    Intro2(String degreeType ,String Name, String LastName,String UserName){
        super(degreeType,Name,LastName);
        this.UserName=UserName;
    }
    Intro2(String email, String Password){
        this.Email=email;
        this.Password=Password;
    }
}
