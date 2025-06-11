package inheritance;

public class Box {
    double l;
    double w;
    double h;

     Box (){
         this.l=-20;
         this.w=-20;
         this.h=-10;
    }
    Box(double side){
         this.l=side;
         this.h=side;
         this.w=side;

    }
    Box(double l,double w,double h){
         this.l=l;
         this.h=h;
         this.w=w;
    }

}
