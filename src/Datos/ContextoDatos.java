package Datos;

import Modelos.*;

public class ContextoDatos {
    public static Plataforma Netflix = new Plataforma("Netflix");
    public static Plataforma AmazonPrime = new Plataforma("AmazonPrime");
    public static Plataforma Youtube = new Plataforma("YouTube");
    public static void  IniciarContexto(){
        Netflix.titulos.add(new SerieDeTV("DanDaDan", 20, "Anime", 1));
        Netflix.titulos.add(new Pelicula("Avatar", 120, "Ciencia Ficcion", "Disney"));
        Netflix.titulos.add(new Documental("La edad media", 120, "Documental", "Vida antigua"));

        AmazonPrime.titulos.add(new SerieDeTV("The Boys", 24, "Accion", 3));
        AmazonPrime.titulos.add(new Pelicula("El Señor de los Anillos", 178, "Ciencia Ficcion", "New Line Cinema"));
        AmazonPrime.titulos.add(new Documental("History 101", 30, "Documental", "Netflix"));
        AmazonPrime.titulos.add(new Pelicula("Parasite", 132, "Drama", "CJ Entertainment"));
        AmazonPrime.titulos.add(new SerieDeTV("Invincible", 8, "Anime", 1));

        Youtube.titulos.add(new Documental("The Social Dilemma", 94, "Documental", "Netflix"));
        Youtube.titulos.add(new Stream(300, "Haciendo ejercicio dia", 276, "Ocio"));
        Youtube.titulos.add(new Stream(200, "Jugando Zelda", 156, "Ocio"));
        Youtube.titulos.add(new Documental("Minimalism", 79, "Documental", "Netflix"));
    }
}
