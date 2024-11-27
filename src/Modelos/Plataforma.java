package Modelos;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Plataforma {
    private String nombre;
    public ArrayList<ContenidoAudiovisual> titulos = new ArrayList<ContenidoAudiovisual>();

    public Plataforma(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){return nombre;}
    public List<String> ObtenerCategorias(){
        var categorias = titulos.stream()
                .map(c -> c.getGenero())
                .collect(Collectors.toList());
        return categorias;
    }
    public void descargarTitulos(){
        var ruta = "./src/Descargas/titulos" + this.nombre + ".txt";
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(ruta))){
            writer.write("Titulos de netflix");
            writer.newLine();
            for(var t : titulos){
                writer.write(t.getTitulo());
                writer.newLine();
            }
            System.out.println("Revisa tu carpeta de Descargas en este proyecto!");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public ContenidoAudiovisual importarTitulo(int idContenido){
        Path ruta = Paths.get("./src/Cargas/carga.txt");
        try {
            var lineas = Files.readAllLines(ruta);
            if(idContenido == 1){
                return new Documental(lineas.get(0), Integer.parseInt(lineas.get(1)), lineas.get(2), lineas.get(3));
            } else if (idContenido == 2) {
                return new Pelicula(lineas.get(0), Integer.parseInt(lineas.get(1)), lineas.get(2), lineas.get(3));
            } else if (idContenido == 3) {
                return new SerieDeTV(lineas.get(0), Integer.parseInt(lineas.get(1)), lineas.get(2), Integer.parseInt(lineas.get(3)));
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }
}
