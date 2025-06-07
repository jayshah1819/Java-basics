package ConcurrencyExample;

public class Main {
    public static void main(String[] args) {
        //example of method overloading and overriding
        //ConcurrencyExample.Main.Calculator calc= new ConcurrencyExample.Main.Calculator();
       // ConcurrencyExample.Main.AdvanceCalculator advancedCalc= new ConcurrencyExample.Main.AdvanceCalculator();
       // calc.display();
       // advancedCalc.display();

        //example of print issues
        //System.out.println(100+100+"Keep shining");
        //System.out.println("Keep Shining"+ 100+100);

        //Thread Lifecycle
        World w = new World();//Thread--->new state
        w.start();
        for (int i=0;i<20000;i++) {

            System.out.println("Hello");
        }
    }

    public static class Calculator {
        int add(int a, int b){
            return a+b;
        }
        double add(double a,double b){
            return a+b;
        }
        void display(){
            System.out.println("Standard calculator");
        }
    }

    public static class AdvanceCalculator extends Calculator {
        @Override
        void display(){
            System.out.println("advanced calculator");
        }
    }

    public static class World extends Thread{
        public void run() {
            for(int i=0;i<10000;i++) {
                System.out.println("ConcurrencyExample.Main.World");
            }
        }

    }
}
