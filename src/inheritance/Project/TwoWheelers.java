package inheritance.Project;

public class TwoWheelers extends Vehicles{
    int Tires;
    int Engine;
    int hp;
    TwoWheelers(int tires,int Engine,int hp,int year,String brand, int numberPlate){
        super(year,brand,numberPlate);

    }
}
