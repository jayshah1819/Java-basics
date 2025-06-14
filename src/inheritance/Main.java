package inheritance;

public class Main {
    public static void main(String[] args){
        Box box1=new Box();
        BoxWeight box2=new BoxWeight(1,3,3);
        System.out.println(box2.l+" "+box2.h+" "+box2.w+" "+box2.weight);
        //just checked and added new values.
        Box box3=new BoxWeight(1,3,4);
    }

}
