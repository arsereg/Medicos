package bl;

public class EscuelaDeMedicos {

    public Doctor crearDoctor(String pnombre, String papellido, String pespecialidad){
        return new Doctor(pnombre, papellido, pespecialidad);
    }

}
