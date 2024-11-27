package Modelos;

import java.util.ArrayList;

public class Stream extends ContenidoAudiovisual{
    private int _espectadores;
    private Influencer _influencer;
    public Stream(int espectadores, String titulo, int duracionEnMinutos, String genero){
        super(titulo, duracionEnMinutos, genero);
        this._espectadores = espectadores;
    }

    public int getEspectadores() {
        return _espectadores;
    }

    public void setEspectadores(int espectadores) {
        this._espectadores = espectadores;
    }
    public Influencer getInfluencer(){
        return this._influencer;
    }
    public void setINfluencer(Influencer value){
    this._influencer = value;
    }
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del Stream:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Espectadores: " + getEspectadores());
        System.out.println();
    }
    @Override
    public void imprimirPropiedades(){
        System.out.println("titulo");
        System.out.println("duracion en minutos");
        System.out.println("genero");
        System.out.println("Influencer");
    }
}
