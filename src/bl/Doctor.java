package bl;

public class Doctor {

    String nombre;
    String apellido;
    String especialidad;

    public Doctor(String pnombre, String papellido, String pespecialidad){
        this.nombre = pnombre;
        this.apellido = papellido;
        this.especialidad = pespecialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String toString(){
        String resultado = "";
        resultado += "{";
        resultado += "\n    \"nombre\": \"" + this.nombre + "\"";
        resultado += "\n    \"apellido\": \"" + this.apellido + "\"";
        resultado += "\n    \"especialidad\": \"" + this.especialidad + "\"";
        resultado += "\n}";
        return resultado;
    }



}
