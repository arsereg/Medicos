package bl;

public class Paciente {
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    String nombre;

    public Paciente(String pnombre){
        this.nombre = pnombre;
    }
}
