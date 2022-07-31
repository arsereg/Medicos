package bl;

import java.util.ArrayList;
import java.util.List;

public class ExpedienteMedico {

    private Doctor doctor;
    private Paciente paciente;

    private List<String> diganosticos;

    public ExpedienteMedico(){
        this.diganosticos = new ArrayList<>();
    }

    public ExpedienteMedico(Doctor pdoctor, Paciente ppaciente){
        this.setDoctor(pdoctor);
        this.setPaciente(ppaciente);
        this.diganosticos = new ArrayList<>();
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public List<String> getDiganosticos() {
        return diganosticos;
    }

    public void setDiganosticos(List<String> diganosticos) {
        this.diganosticos = diganosticos;
    }
}
