/**
 * Clase que representa un trabajador.
 */
public class Trabajador {

    private int precio;

    private int stockDeInstrumento;

    /**
     * Constructor.
     *
     * @param precio
     * @param stockDeInstrumento
     */
    public Trabajador(int precio, int stockDeInstrumento){
        this.precio = precio;
        this.stockDeInstrumento = stockDeInstrumento;
    }
    /**
     * Obtiene el precio del trabajador.
     *
     * @return el precio del trabajador.
     */
    public int getPrecio() {
        return precio;
    }
    /**
     * Establece el precio del trabajador.
     *
     * @param precio el precio del trabajador.
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    /**
     * Obtiene el stock de instrumento del trabajador.
     *
     * @return el stock de instrumento del trabajador.
     */
    public int getStockDeInstrumento() {
        return stockDeInstrumento;
    }
    /**
     * Establece el stock de instrumento del trabajador.
     *
     * @param stockDeInstrumento el stock de instrumento del trabajador.
     */
    public void setStockDeInstrumento(int stockDeInstrumento) {
        this.stockDeInstrumento = stockDeInstrumento;
    }
}
