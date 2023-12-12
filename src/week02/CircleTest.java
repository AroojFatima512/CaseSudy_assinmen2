package week02;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {


        Circle c1=new Circle();

//      c1.radius=-20; Will Produce compile Time error as radius is encapsulated
        c1.setRadius(3);


//      System.out.println("Radius:"+c1.radius);
        System.out.println("Radius of circle:"+c1.getRadius());
        System.out.println("Area of circle:"+c1.calArea());
        System.out.println("Circumference of circle:"+c1.calCircumference());

    }
}
