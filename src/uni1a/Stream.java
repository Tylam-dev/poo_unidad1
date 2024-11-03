package uni1a;

import NuevasClases.Actor;
import NuevasClases.Temporada;

import java.util.ArrayList;

public class Stream extends ContenidoAudiovisual{
    String plataforma;
    int espectadores;
    private ArrayList<Temporada> temporadas;
    public Stream(String plataforma, int espectadores, String titulo, int duracionEnMinutos, String genero){
        super(titulo, duracionEnMinutos, genero);
        this.plataforma = plataforma;
        this.espectadores = espectadores;
        this.Temporadas = new ArrayList<>();
    }
    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public int getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(int espectadores) {
        this.espectadores = espectadores;
    }
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del Stream:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Temporadas: " + this.temporadas);
        for (Temporada temp: temporadas)
        {
            System.out.println("-" + temp);
        }
        System.out.println();
    }
}
