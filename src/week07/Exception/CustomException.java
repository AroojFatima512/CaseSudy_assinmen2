package week07.Exception;

public class CustomException extends Exception{

    CustomException(String message){
        super(message);
    }
    @Override
    public String getMessage(){
        return "message from custom exception";
    }
}
