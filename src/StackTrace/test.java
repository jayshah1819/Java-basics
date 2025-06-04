package StackTrace;
//StackTrace is detail information of methods calls that led to error.
public class test {
    public static void main(String[] args) {
        try {
            level3();
        }
        catch (Exception e) {
            System.out.println(e);
        }

    }
    public static void level1(){
        int[] arr=new int[5];
        arr[5]=10;



    }

    private static void level2() {
        level1();
    }

    private static void level3() {
        level2();

    }
}
