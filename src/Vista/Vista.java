package Vista;

import Enums.OpcionesSesion;

import java.util.Scanner;

public class Vista {
    private Scanner scanner = new Scanner(System.in);

    public void IniciarSesion()
    {
        System.out.println("Inicie sesion segun su rol");
        System.out.println(OpcionesSesion.USUARIO.getOpcion() + "." + OpcionesSesion.USUARIO.getRol());
        System.out.println(OpcionesSesion.ADMINISTRADOR.getOpcion() + "." + OpcionesSesion.ADMINISTRADOR.getRol());
    }
    public void MostarOpcionesUsuario(){
        System.out.println("Escoja la opcion que desea realizar");
        System.out.println("1.Ver catalogo");
        System.out.println("2.Descargar catalogo");
        System.out.println("3.Cerrar sesion");
        var opcionEscogida = scanner.nextInt();
        if(opcionEscogida == 1){

        } else if (opcionEscogida == 2) {

        } else if (opcionEscogida == 3) {
            IniciarSesion();
        }else {
            System.out.println("Ha escogido una opcion invalida");
            MostarOpcionesUsuario();
        }
    }
}
