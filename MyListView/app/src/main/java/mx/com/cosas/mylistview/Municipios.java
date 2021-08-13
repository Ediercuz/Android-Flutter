package mx.com.cosas.mylistview;

public class Municipios {

    // Atributos de la clase
    private int numMun;
    private String nombre;
    private String extencion;
    private String poblacion;

    public Municipios(int numMun, String nombre, String extencion, String poblacion) {
        this.numMun = numMun;
        this.nombre = nombre;
        this.extencion = extencion;
        this.poblacion = poblacion;
    }

    public int getNumMun() {
        return numMun;
    }

    public void setNumMun(int numMun) {
        this.numMun = numMun;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getExtencion() {
        return extencion;
    }

    public void setExtencion(String extencion) {
        this.extencion = extencion;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }
}
