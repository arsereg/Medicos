package bl;

import java.time.LocalDate;

public class Application {

    Hospital sanJuanDeDios = new Hospital();
    EscuelaDeMedicos escuelaDeMedicos = new EscuelaDeMedicos();

    public void crearUnDoctor(String pnombre, String papellido, String pespecialidad){
        sanJuanDeDios.registrarDoctor(escuelaDeMedicos.crearDoctor(pnombre, papellido, pespecialidad));
    }

    public void crearPaciente(String nombre){
        Paciente unPaciente = new Paciente(nombre);
        sanJuanDeDios.registrarPaciente(unPaciente);
    }

    public void crearCitaMedica(String nombreDoctor, String nombrePaciente, LocalDate fecha) throws Exception{
        try{
            sanJuanDeDios.crearCitaMedica(nombreDoctor, nombrePaciente, fecha);
        }catch(Exception e){
            e.printStackTrace();
            throw e;
        }
    }



}
