package week07.Exception;


import week07.Exception.A;

import java.io.FileNotFoundException;

public class Driver {
    public static void main(String[] args) throws FileNotFoundException {
        try{
            A a=new A();
        }
     finally {
            System.out.println();
        }
    }
    }


