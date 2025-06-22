package OOPsConcecpts.ProjcectUsingOops;

import java.util.Random;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args){
        User user1=new User();



        Scanner myobj=new Scanner(System.in);
        System.out.println("Please Write your name");
        String userName=myobj.nextLine();
        System.out.println("Nice to meet you"+" " + userName+"!");
        System.out.println("Can you type your Account Number associated with us or press 1 to open new account"+userName);
        int accountNumber=myobj.nextInt();

        Random r=new Random();

        if(accountNumber==1){
            user1.AccountNumber=accountNumber;

                 accountNumber=r.nextInt();
                 System.out.println("Your Account number is "+accountNumber);


        }
        else{

        }




        user1.name=userName;


    }

}
