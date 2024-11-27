package Controladores;

import Datos.ContextoDatos;
import Modelos.ContenidoAudiovisual;
import Modelos.Plataforma;

import java.util.ArrayList;
import java.util.List;

public class GeneralController {
    public List<String> ObtenerPlataformas(){
        var plataformas = new ArrayList<String>();
        plataformas.add(ContextoDatos.AmazonPrime.getNombre());
        plataformas.add(ContextoDatos.Youtube.getNombre());
        plataformas.add(ContextoDatos.Netflix.getNombre());
        return  plataformas;
    }
    public Plataforma ObtenerPlataforma(int index){
        if(index == 0){
            return ContextoDatos.AmazonPrime;
        } else if (index == 1) {
            return ContextoDatos.Youtube;
        } else if (index == 2) {
            return ContextoDatos.Netflix;
        }else {
            return null;
        }
    }
}
