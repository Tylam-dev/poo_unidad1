package Enums;

public enum OpcionesSesion {
    USUARIO("Usuario", 1),
    ADMINISTRADOR("Administrador", 2);
    private String rol;
    private int opcion;

    OpcionesSesion(String rol, int opcion) {
        this.rol = rol;
        this.opcion = opcion;
    }
    public String getRol(){
        return rol;
    }
    public int getOpcion(){
        return opcion;
    }
    // Método estático para buscar por id
    public static OpcionesSesion fromOpcion(int opcion) {
        for (OpcionesSesion rol : OpcionesSesion.values()) {
            if (rol.opcion  == opcion) {
                return rol;
            }
        }
        throw new IllegalArgumentException("No existe una opcion " + opcion);
    }
}
