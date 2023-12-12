package week07.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=0;
        int b=0;

        try{
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println("The Answer will be: "+(a/b));
        }
        catch (ArithmeticException e ){
            System.out.println("ArithmeticException");
        }
        catch (InputMismatchException e){
            System.out.println("InputMismatchException");
        }
        finally {
            System.out.println("My Code");
        }


    }
}
