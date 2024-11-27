package Modelos;

public class Investigador {
    private String nombre;
    private String campoEstudio;
    private int aniosExperiencia;

    public Investigador(String nombre, String campoEstudio, int aniosExperiencia) {
        this.nombre = nombre;
        this.campoEstudio = campoEstudio;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCampoEstudio() {
        return campoEstudio;
    }

    public void setCampoEstudio(String campoEstudio) {
        this.campoEstudio = campoEstudio;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public void investigar() {
        System.out.println(nombre + " está investigando en el campo de " + campoEstudio + ".");
    }
}
