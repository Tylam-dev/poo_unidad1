package poo;
import Datos.ContextoDatos;
import Modelos.*;
import Vista.Vista;

public class PruebaAudioVisual {
	public static void main(String[] args) {
        ContextoDatos.IniciarContexto();
        Vista vista = new Vista();
        vista.IniciarSesion();
    }
}