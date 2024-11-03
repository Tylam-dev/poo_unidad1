package uni1a;

import NuevasClases.Actor;

import java.util.ArrayList;

public class TikTok extends ContenidoAudiovisual{ // Duración en segundos
    private int numLikes;
    private ArrayList<Actor> Actores;
    public TikTok(int duracionEnMinutos, String titulo, String genero, int numLikes) {
        super(titulo, duracionEnMinutos, genero);
        this.numLikes = numLikes;
    }

    public int getNumLikes() {
        return numLikes;
    }

    public void setNumLikes(int numLikes) {
        this.numLikes = numLikes;
    }
    public void AgregarActor(Actor actor) {
        Actores.add(actor);
    }
    @Override
    public void mostrarDetalles() {
        String nombresActores = "Actores: ";
        for(Actor ac : Actores){
            nombresActores = nombresActores + ac.getNombre();
        }
        System.out.println("Detalles del Tiktok:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Likes: " + numLikes);
        System.out.println(nombresActores);
        System.out.println();
    }
}
