package meyerBricksApp.MeyerBriggsExceptions;

public class MeyerBriggsAppException extends RuntimeException{
    public MeyerBriggsAppException(){
        super();
    }
    public MeyerBriggsAppException(String message){
        super(message);
    }
    public MeyerBriggsAppException(String message, Throwable throwable){
        super(message, throwable);
    }
    public MeyerBriggsAppException(Throwable throwable){
        super(throwable);
    }
}
