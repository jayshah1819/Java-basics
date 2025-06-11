package inheritance;

public class BoxWeight extends Box {
    int weight;
    BoxWeight(double l,double h,double w ){
        super(l,h,w);
        this.weight=-1;
    }
}
