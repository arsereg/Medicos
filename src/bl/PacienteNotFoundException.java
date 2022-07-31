package bl;

public class PacienteNotFoundException extends Exception{
    public PacienteNotFoundException(String errorName){
        super(errorName);
    }
}
