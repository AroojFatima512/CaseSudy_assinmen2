package week07.Exception;


import week07.Exception.CustomException;

import java.io.IOException;

public class CustomExceptionTest {
    public static void main(String[] args) throws IOException{
        try{
            throw new CustomException("Illegal value");
        }
        catch (CustomException e){
            System.out.println(e.getMessage());
        }

        divide();
    }



    static double divide()throws IllegalArgumentException, IOException {
        //
        return 0;
    }


}