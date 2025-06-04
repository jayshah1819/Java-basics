package ExceptionHandling;

public class test {
    public static void main(String[] args) {

        int[] numerator = {20, 30, 40, 50};
        int[] denominator = {20, 30, 0, 50};
        for (int i = 0; i < numerator.length; i++) {
            try {
                System.out.println(divide(numerator[i], denominator[i]));
            }
            catch (Exception e) {
                System.out.println(e);

            }//

        }
    }


    private static int divide(int a, int b) {
        Student studn = new Student();


        try {
            studn =null;
            studn.NUMBER=2;
            System.out.println(studn.NUMBER);
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println(e);
            return 0;
        }




    }

}





