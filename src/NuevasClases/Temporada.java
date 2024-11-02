package NuevasClases;

public class Temporada {
    private int numero;
    private int episodios;
    private List<String> titulosEpisodios;

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

    public List<String> getTitulosEpisodios() {
        return titulosEpisodios;
    }
}
