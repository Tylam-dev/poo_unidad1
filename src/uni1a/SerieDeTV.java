/**
 * Class SerieDeTV
 */
package uni1a;

import NuevasClases.Temporada;

import java.util.ArrayList;

// Subclase SerieDeTV que extiende de ContenidoAudiovisual
public class SerieDeTV extends ContenidoAudiovisual {
    private int temporadas;
    private ArrayList<Temporada> Temporadas;

    public SerieDeTV(String titulo, int duracionEnMinutos, String genero, int temporadas) {
        super(titulo, duracionEnMinutos, genero);
        this.temporadas = temporadas;
        this.Temporadas = new ArrayList<>();
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    public void AgregarTemporada(Temporada temp)
    {
        Temporadas.add(temp);
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la Serie:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Temporadas: " + this.temporadas);
        for (Temporada temp: Temporadas)
        {
            System.out.println("-" + temp);
        }
        System.out.println();
    }
}