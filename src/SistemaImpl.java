import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;


/**
 * Implementación de la interfaz Sistema.
 */
public class SistemaImpl implements  Sistema{

    private ListaInstrumento listadoInstrumentos;

    private ListaTrabajador listadoTrabajador;

    /**
     * Constructor de la clase SistemaImpl.
     */
    public SistemaImpl() throws IOException {
        menuSistema();

    }

    /**
     * Menú principal.
     *
     */
    @Override
    public void menuSistema() throws IOException {

        Scanner sc = new Scanner(System.in);
        String opcion = null;
        while(!Objects.equals(opcion, "4")){

            System.out.println("♫♬♪♩  Beat the Rhytm  ♫♬♪♩");
            System.out.println();
            System.out.println("[1] Agregar Instrumento");
            System.out.println("[2] Vender Instrumento");
            System.out.println("[3] Consultar Inventario");
            System.out.println();
            System.out.println("[4] Cerrar Programa");
            System.out.println();
            System.out.println("Seleccione una opcion: ");
            opcion = sc.nextLine();

            switch (opcion){
                case "1" -> agregarInstrumento();
                case "2" -> venderInstrumento();
                case "3" -> consultarInventario();
                case "4" -> cerrar();
                default -> System.out.println("Opcion invalida");
            }
        }
    }
    /**
     * Muestra el menú de agregar instrumento y permite al usuario seleccionar un tipo de instrumento para agregar.
     *
     */
    public void agregarInstrumento() throws IOException {

        Scanner sc = new Scanner(System.in);
        String opcion = null;
        while(!Objects.equals(opcion, "4")){

            System.out.println("♫♬♪♩  Agregar Instrumento  ♫♬♪♩");
            System.out.println();
            System.out.println("[1] Cuerda ");
            System.out.println("[2] Viento ");
            System.out.println("[3] Percusion ");
            System.out.println();
            System.out.println("[4] Volver atras");
            System.out.println();
            System.out.println("Seleccione el tipo de instrumento: ");
            opcion = sc.nextLine();

            switch (opcion){
                case "1" -> ListaInstrumento.agregarInstrumentoCuerda();
                case "2" -> ListaInstrumento.agregarInstrumentoViento();
                case "3" -> ListaInstrumento.agregarInstrumentoPercusion();
                case "4" -> System.out.println();
                default -> System.out.println("Opcion invalida");
            }
        }
    }
    /**
     * Vende un instrumento del inventario.
     *
     */
    @Override
    public void venderInstrumento() throws IOException {

        ListaInstrumento.venderInstrumento();

    }
    /**
     * Muestra el inventario de instrumentos.
     */
    @Override
    public void consultarInventario() {

        ListaInstrumento.consultarInventario();

    }
    /**
     * Cierra el programa.
     */
    @Override
    public void cerrar() {
        System.out.println("Cerrando programa.....");
    }
}
