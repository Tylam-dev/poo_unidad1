/**
 * Class Pelicula
 */
package uni1a;

import NuevasClases.Actor;

import java.lang.reflect.Array;
import java.util.ArrayList;

// Subclase Pelicula que extiende de ContenidoAudiovisual
public class Pelicula extends ContenidoAudiovisual {
    private String estudio;
    private ArrayList<Actor> Actores;

    public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio) {
        super(titulo, duracionEnMinutos, genero);
        this.estudio = estudio;
        this.Actores = new ArrayList<Actor>();
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
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
        System.out.println("Detalles de la película:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Estudio: " + estudio);
        System.out.println(nombresActores);
        System.out.println();
    }
}