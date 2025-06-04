public class Main {
    public static void main(String[] args) {
        //example of method overloading and overriding
        //Calculator calc= new Calculator();
       // AdvanceCalculator advancedCalc= new AdvanceCalculator();
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
}
