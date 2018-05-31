package principal;

public class Familiar extends Persona {

    private String tipo;

    public Familiar(int idPersona, String nombre, String apellidoPaterno, String apellidoMaterno, String telefono, String domicilio, String tipo) {
        super(idPersona, nombre, apellidoPaterno, apellidoMaterno, telefono, domicilio);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + "<br>&emsp &emsp &emsp<b>Tipo: </b>" + tipo ;
    }

}
