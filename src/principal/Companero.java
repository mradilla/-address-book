package principal;

public class Companero extends Persona {

    private String empresa, area, rubroEmpresa;

    public Companero(int idPersona, String nombre, String apellidoPaterno, String apellidoMaterno, String telefono, String domicilio, String empresa, String area, String rubroEmpresa) {
        super(idPersona, nombre, apellidoPaterno, apellidoMaterno, telefono, domicilio);
        this.empresa = empresa;
        this.area = area;
        this.rubroEmpresa = rubroEmpresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getRubroEmpresa() {
        return rubroEmpresa;
    }

    public void setRubroEmpresa(String rubroEmpresa) {
        this.rubroEmpresa = rubroEmpresa;
    }

    @Override
    public String toString() {
        return super.toString() + " <br>&emsp &emsp &emsp<b>Empresa:</b> " + empresa + "<br>&emsp &emsp &emsp<b>Area:</b> " + area + "<br>&emsp &emsp &emsp<b>Rubro de la empresa: </b>" + rubroEmpresa;
    }

}
