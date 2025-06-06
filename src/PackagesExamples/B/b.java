package PackagesExamples.B;


import static PackagesExamples.A.a.message;

public class b {
    public static void main(String[] args){

        System.out.println("If this is running and B is not running then I have not called package");
        message();//I cant write it outside of this main otherwise thats totally new thing we have to make new method if we want it outside o
        //our class of main

    }

    // I understood that i cannot direclty call the psvm file of that but i can call the method of that class files
}
