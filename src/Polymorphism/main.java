package Polymorphism;

public class main {
    public static void main(String[] args){
        rectangle rect=new rectangle();
        shapes sh=new shapes();
        square sq=new square();
        Triangle tr=new Triangle();



        sh.sides();
        sq.sides();
        tr.sides();
    }
}
