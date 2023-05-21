/**
 * Clase que representa una lista de trabajadores.
 */
public class ListaTrabajador {

    private int cantidadTrabajador;

    private int cantidadMaxima;

    private Trabajador[] listaTrabajador;
    /**
     * Constructor
     *
     * @param cantidadMaxima
     */
    public ListaTrabajador(int cantidadMaxima){
        this.cantidadMaxima = cantidadMaxima;
        this.cantidadTrabajador = 0;
        this.listaTrabajador = new Trabajador[cantidadMaxima];
    }
    /**
     * Obtiene la cantidad actual de trabajadores en la lista.
     *
     * @return La cantidad de trabajadores en la lista.
     */
    public int getCantidadTrabajador() {
        return cantidadTrabajador;
    }
    /**
     * Obtiene la cantidad máxima de trabajadores que puede contener la lista.
     *
     * @return La cantidad máxima de trabajadores.
     */
    public int getCantidadMaxima() {
        return cantidadMaxima;
    }
}
