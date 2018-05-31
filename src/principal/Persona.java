package principal;

public class Persona {

    private int idPersona;
    private String nombre, apellidoPaterno, apellidoMaterno, telefono, domicilio;

    public Persona(int idPersona, String nombre, String apellidoPaterno, String apellidoMaterno, String telefono, String domicilio) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.telefono = telefono;
        this.domicilio = domicilio;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return "<html><b>&emsp<h2>"+ nombre + " " + apellidoPaterno + " " + apellidoMaterno + "</h2></b><br>"
                + "     &emsp<b>Telefono:</b> " + telefono + " <br>"
                + "     &emsp<b>Domicilio:</b> " + domicilio;
    }

}
