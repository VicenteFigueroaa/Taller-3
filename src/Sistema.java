import java.io.FileNotFoundException;
import java.io.IOException;

public interface Sistema {

    /**
     * Menú principal.
     */
    public void menuSistema() throws IOException;
    /**
     * Agrega un instrumento al sistema.
     */
    public void agregarInstrumento() throws IOException;
    /**
     * Vende un instrumento del sistema.
     */
    public void venderInstrumento() throws IOException;
    /**
     * Muestra el inventario de instrumentos.
     */
    public void consultarInventario();
    /**
     * Cierra el programa.
     */
    public void cerrar();
}
