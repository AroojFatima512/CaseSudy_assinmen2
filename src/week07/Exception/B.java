package week07.Exception;

public class B {
    int a;
    int b;
    int c;
    public int divide( int a, int b){
       int result;
        try{
          result = a/b;

        }
        catch (ArithmeticException e ){
            result = 0 ;

        }
        return result;
    }


}
