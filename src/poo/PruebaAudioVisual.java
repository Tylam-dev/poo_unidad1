package poo;
import NuevasClases.Temporada;
import uni1a.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class PruebaAudioVisual {
	public static void main(String[] args) {
        System.out.println("Hello from Eclipse!");

        // Crear instancias de las subclases
        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[5];
        contenidos[0] = new Pelicula("Avatar", 125, "Accion", "20th Century Studios");
        contenidos[1] = new SerieDeTV("Game of Thrones", 60, "Fantasy", 8);
        contenidos[2] = new Documental("Cosmos", 45, "Science", "Astronomy");
        contenidos[3] = new Stream("Twitch", 4000, "Jugando LoL", 120, "VideoJuegos");
        contenidos[4] = new TikTok(1, "5 Noticas del día", "Noticias", 3000);
        // Mostrar los detalles de cada contenido audiovisual
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }
    }
}