package NuevasClases;

public class Investigador {
    private String nombre;
    private String campoEstudio;
    private int añosExperiencia;

    public Investigador(String nombre, String campoEstudio, int añosExperiencia) {
        this.nombre = nombre;
        this.campoEstudio = campoEstudio;
        this.añosExperiencia = añosExperiencia;
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

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    public void investigar() {
        System.out.println(nombre + " está investigando en el campo de " + campoEstudio + ".");
    }
}
