package poo;
import NuevasClases.Temporada;
import uni1a.*;

import java.util.ArrayList;

public class PruebaAudioVisual {
	public static void main(String[] args) {
        System.out.println("Hello from Eclipse!");

        // Crear instancias de las subclases
        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[3];
        contenidos[0] = new Pelicula("Avatar", 125, "Accion", "20th Century Studios");
        contenidos[1] = new SerieDeTV("Game of Thrones", 60, "Fantasy", 8,
                new ArrayList<Temporada>(Arrays.asList(new Temporada(1, 18),
                        Arrays.asList(new Temporada(2, 20)))));
        contenidos[2] = new Documental("Cosmos", 45, "Science", "Astronomy");

        // Mostrar los detalles de cada contenido audiovisual
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }
    }
}