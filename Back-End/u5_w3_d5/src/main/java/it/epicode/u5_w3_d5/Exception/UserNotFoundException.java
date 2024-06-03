package it.epicode.u5_w3_d5.Exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String message){
    super(message);
    }
}
