package Enums;

public enum OpcionesAdministrador {
    AGREGAR_TITULO("Agregar titulo", 1),
    BORRAR_TITULO("Borrar titulo", 2);
    private String descripcion;
    private int id;

    OpcionesAdministrador(String descripcion, int id){
        this.descripcion = descripcion;
        this.id = id;
    }

    public String getDescripcion(){
        return descripcion;
    }
    public int getOpcion(){
        return id;
    }
    public static OpcionesAdministrador AdminFromOpcion(int id) {
        for (OpcionesAdministrador opcion : OpcionesAdministrador.values()) {
            if (opcion.id == id) {
                return opcion;
            }
        }
        throw new IllegalArgumentException("No existe una etapa con el id: " + id);
    }
}
