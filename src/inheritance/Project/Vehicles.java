package inheritance.Project;

public class Vehicles {
    int year;
    String brand;
    int numberPlate;
    //private static int specialNo; child class will not able to acess thisso

    Vehicles(int year,String brand,int numberPlate){
        this.year=year;
        this.brand=brand;
        this.numberPlate=numberPlate;
        //specialNo=2029292;
    }

}
