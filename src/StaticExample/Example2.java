package StaticExample;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        System.out.println("Write a number");
        Scanner Mynum= new Scanner(System.in);
        int num = Mynum.nextInt();
        square(num);
        cube(num);
    }
    static void square(int a){
        int x=a*a;
        System.out.println(x);
    }
    static void cube(int a){
        int y=a*a*a;
        System.out.println(y);
    }
}

