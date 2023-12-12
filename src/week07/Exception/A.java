package week07.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        B b=new B();
        int x=0;
        int y=0;
        try {
            x=s.nextInt();
            y=s.nextInt();
        } //Throw new Exception
        catch (InputMismatchException e){
            System.out.println("InputMismatch");
        }

        b.divide(x,y);




    }
}
