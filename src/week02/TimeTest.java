package week02;

import java.util.Scanner;

public class TimeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Hours: ");
        int a=sc.nextInt();
        System.out.print("Enter the Minutes: ");
        int b=sc.nextInt();
        System.out.print("Enter the Second: ");
        int c=sc.nextInt();

        Time t1=new Time(a,b,c);
        String s=t1.getUniversalTime();
        System.out.println(s);
    }
}
