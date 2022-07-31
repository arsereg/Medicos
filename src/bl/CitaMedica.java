package bl;

import java.time.LocalDate;

public class CitaMedica {
    Doctor doctor;
    Paciente paciente;

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

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    LocalDate fecha;

    public CitaMedica(Doctor pdoctor, Paciente ppaciente, LocalDate pfecha){
        this.doctor = pdoctor;
        this.paciente = ppaciente;
        this.fecha = pfecha;
    }

}
