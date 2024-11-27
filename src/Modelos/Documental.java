/**
 * Class Documental
 */
package Modelos;

import java.util.ArrayList;

// Subclase Documental que extiende de ContenidoAudiovisual
public class Documental extends ContenidoAudiovisual {
    private String tema;
    private ArrayList<Investigador> Investigadores = new ArrayList<Investigador>();

    public Documental(String titulo, int duracionEnMinutos, String genero, String tema) {
        super(titulo, duracionEnMinutos, genero);
        this.tema = tema;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
    public void agregarInvestigardor(Investigador inv){
        Investigadores.add(inv);
    }
    
    @Override
    public void mostrarDetalles() {
        String inv = "Investigadores: ";
        for(Investigador iv: Investigadores)
        {
            inv = inv + iv.getNombre();
        }
        System.out.println("Detalles del documental:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Tema: " + this.tema);
        System.out.println(inv);
        System.out.println();
    }
    @Override
    public void imprimirPropiedades(){

    }
}