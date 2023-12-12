package week07.Exception;

public class Test {
    public static void main(String[] args) {
        int list[]={0,1,2,3};
        try{
            System.out.println(list[4]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        catch (RuntimeException e){
            System.out.println("RunTime");
        }
    }
}
