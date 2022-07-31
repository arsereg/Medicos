package bl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Hospital {

    private List<Doctor> doctorList;
    private List<Paciente> pacienteList;

    private List<ExpedienteMedico> expedienteMedicosList;

    private List<CitaMedica> citaMedicaList;

    List<String> listaNegra = List.of("Esteban", "Ana", "Maria", "Juancho");

    public Hospital(){
        doctorList = new ArrayList<>();
        pacienteList = new ArrayList<>();
        expedienteMedicosList = new ArrayList<>();
        citaMedicaList = new ArrayList<>();
    }

    public void registrarDoctor(Doctor doctor){
        this.doctorList.add(doctor);
    }

    public void registrarPaciente(Paciente paciente) {
        if(!listaNegra.contains(paciente.nombre)){
            this.pacienteList.add(paciente);
        }
    }

    public void crearCitaMedica(String nombreDoctor, String nombrePaciente, LocalDate fecha) throws DoctorNotFoundException, PacienteNotFoundException {
        Doctor doctor = null;
        for(int i = 0; i < doctorList.size(); i++){
            if(doctorList.get(i).nombre.equals(nombreDoctor)){
                doctor = doctorList.get(i);
            }
        }
        if(doctor == null){
            throw new DoctorNotFoundException("Ese doctor no se ha encontrado");
        }
        Paciente unPaciente = null;
        for (int i = 0; i < pacienteList.size(); i++) {
            if(pacienteList.get(i).nombre.equals(nombrePaciente)){
                unPaciente = pacienteList.get(i);
            }
        }
        if(unPaciente == null){
            throw new PacienteNotFoundException("Ese paciente no se ha encontrado");
        }

        this.citaMedicaList.add(new CitaMedica(doctor, unPaciente, fecha));

    }

}
