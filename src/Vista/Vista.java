package Vista;

import Controladores.GeneralController;
import Enums.OpcionesSesion;
import Modelos.ContenidoAudiovisual;
import Modelos.Plataforma;

import java.util.Scanner;

public class Vista {
    private Scanner scanner = new Scanner(System.in);
    private GeneralController controladorGeneral = new GeneralController();
    private String rolUsuario;
    public void IniciarSesion()
    {
        this.rolUsuario = null;
        System.out.println("Inicie sesion segun su rol");
        System.out.println(OpcionesSesion.USUARIO.getOpcion() + "." + OpcionesSesion.USUARIO.getRol());
        System.out.println(OpcionesSesion.ADMINISTRADOR.getOpcion() + "." + OpcionesSesion.ADMINISTRADOR.getRol());
        System.out.println("3.Salir");
        var opcionEscogida = this.scanner.nextInt();
        if(opcionEscogida == 1){
            rolUsuario = OpcionesSesion.USUARIO.getRol();
            MostrarPlataformas();
        } else if (opcionEscogida == 2) {
            rolUsuario = OpcionesSesion.ADMINISTRADOR.getRol();
            MostrarPlataformas();
        } else if (opcionEscogida == 3) {
            return;
        } else {
            System.out.println("Escoja una opcion valida");
            IniciarSesion();
        }
    }

    public void MostrarPlataformas(){
        System.out.println("Escoja la plataforma a la que quiere ingresar");
        var opciones = this.controladorGeneral.ObtenerPlataformas();
        System.out.println("1." + opciones.get(0));
        System.out.println("2" + opciones.get(1));
        System.out.println("3" + opciones.get(2));
        System.out.println("4.Cerrar Sesión");
        var opcionEscogida = this.scanner.nextInt();
        if(opcionEscogida == 0 || opcionEscogida > 4){
            System.out.println("No ha escogido un numero valido");
            MostrarPlataformas();
        } else if (opcionEscogida == 4) {
            this.IniciarSesion();
        }else {
            if(this.rolUsuario == OpcionesSesion.USUARIO.getRol())
            {
                MostrarOpcionesUsuario(this.controladorGeneral.ObtenerPlataforma(opcionEscogida - 1));
            } else if (this.rolUsuario == OpcionesSesion.ADMINISTRADOR.getRol()) {
                MostrarOpcionesAdministrador(this.controladorGeneral.ObtenerPlataforma(opcionEscogida - 1));
            }
        }
    }
    public void MostrarOpcionesUsuario(Plataforma plataforma){
        System.out.println("Su plataforma es " + plataforma.getNombre() + "Escoja la opcion que desea realizar");
        System.out.println("1.Ver catalogo");
        System.out.println("2.Descargar catalogo");
        System.out.println("3.Cerrar sesion");
        var opcionEscogida = scanner.nextInt();
        if(opcionEscogida == 1){
            for(var t : plataforma.titulos){
                t.mostrarDetalles();
            }
            MostrarOpcionesUsuario(plataforma);
        } else if (opcionEscogida == 2) {
            plataforma.descargarTitulos();
            MostrarOpcionesUsuario(plataforma);
        } else if (opcionEscogida == 3) {
            IniciarSesion();
        }else {
            System.out.println("Ha escogido una opcion invalida");
            MostrarOpcionesUsuario(plataforma);
        }
    }
    public void MostrarOpcionesAdministrador(Plataforma plataforma) {
        System.out.println("Su plataforma es " + plataforma.getNombre() + "Escoja la opcion que desea realizar");
        System.out.println("1.Ver catalogo");
        System.out.println("2.Descargar catalogo");
        System.out.println("3.Subir Titulo");
        System.out.println("4.Cerrar sesion");
        var opcionEscogida = scanner.nextInt();
        if(opcionEscogida == 1){
            for(var t : plataforma.titulos){
                t.mostrarDetalles();
            }
            MostrarOpcionesAdministrador(plataforma);
        } else if (opcionEscogida == 2) {
            plataforma.descargarTitulos();
            MostrarOpcionesAdministrador(plataforma);
        } else if (opcionEscogida == 3) {
            System.out.println("Recuerda que debe ser un archivo txt y \n las carateristicas debe ir separadas saltando un linea. \n Debe editar el archivo cargar.txt en la carpeta Cargas");
            MostrarOpcionesImportar(plataforma);
        } else if (opcionEscogida == 4) {
            IniciarSesion();
        }else {
            System.out.println("Ha escogido una opcion invalida");
            MostrarOpcionesUsuario(plataforma);
        }
    }
    public void MostrarOpcionesImportar(Plataforma plataforma){
        System.out.println("Que desea Importar?");
        System.out.println("1.Documental");
        System.out.println("2.Pelicula");
        System.out.println("3.SerieTv");
        System.out.println("4.Volver");
        var opcionEscogida = scanner.nextInt();
        System.out.println("El documento tiene que tener este orden");
        if(opcionEscogida == 1){
            System.out.println("titulo");
            System.out.println("duracion en minutos");
            System.out.println("genero");
            System.out.println("tema");
            plataforma.titulos.add(QuiereImportar(plataforma, 1));
            MostrarOpcionesAdministrador(plataforma);
        }else if (opcionEscogida == 2){
            System.out.println("titulo");
            System.out.println("duracion en minutos");
            System.out.println("genero");
            System.out.println("estudio");
            plataforma.titulos.add(QuiereImportar(plataforma, 2));
            MostrarOpcionesAdministrador(plataforma);
        }else if (opcionEscogida == 3){
            System.out.println("titulo");
            System.out.println("duracion en minutos");
            System.out.println("genero");
            System.out.println("temporadas");
            plataforma.titulos.add(QuiereImportar(plataforma, 3));
            MostrarOpcionesAdministrador(plataforma);
        } else if (opcionEscogida == 4) {
            MostrarOpcionesAdministrador(plataforma);
        }else{
            System.out.println("Ha ingresado una opcion invalida");
            MostrarOpcionesImportar(plataforma);
        }
    }
    public ContenidoAudiovisual QuiereImportar(Plataforma plataforma, int idContenido){
        System.out.println("Desea importar?");
        System.out.println("1.Si");
        System.out.println("2.No");
        var opcionEscogida = this.scanner.nextInt();
        if(opcionEscogida == 1){
           return plataforma.importarTitulo(idContenido);
        }else {
            MostrarOpcionesImportar(plataforma);
            return null;
        }
    }
}
