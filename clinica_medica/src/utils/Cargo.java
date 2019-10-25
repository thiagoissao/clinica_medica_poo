package utils;

public class Cargo {
    private final static int DOCTOR = 1;
    private final static int SECRETARY = 2; 

    public static int setIsDoctor(){
        return DOCTOR;
    }
    
    public static int setIsSecretary(){
        return SECRETARY;
    }
    
    public static boolean isDoctor(int ref){
        return ref == DOCTOR;
    }
    
    public static boolean isSecretary(int ref){
        return ref == SECRETARY;
    }
}
