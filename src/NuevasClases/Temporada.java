package NuevasClases;
import java.util.ArrayList;

public class Temporada {
    private int numero;
    private int episodios;
    private ArrayList<String> titulosEpisodios;

    public Temporada(int numero, int episodios) {
        this.numero = numero;
        this.episodios = episodios;
        this.titulosEpisodios = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public void agregarTituloEpisodio(String titulo) {
        titulosEpisodios.add(titulo);
    }

    public ArrayList<String> getTitulosEpisodios() {
        return titulosEpisodios;
    }
}
