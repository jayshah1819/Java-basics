package inheritance.Project;

public class Transport {
    public static void main(String[] args){
        TwoWheelers yamaha=new TwoWheelers(2,2,1000,1000,"brand",1000);
        Vehicles v= new Vehicles(10,"old",1000);
        System.out.println(v.brand);
        System.out.println(yamaha.brand);

    }
}
