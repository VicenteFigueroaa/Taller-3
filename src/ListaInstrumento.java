import java.io.*;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class ListaInstrumento {

    private int cantidadInstrumento;

    private int cantidadMaxima;

    private Instrumento[] listaInstrumento;
    /**
     * Constructor.
     *
     * @param cantidadMaxima
     */
    public ListaInstrumento(int cantidadMaxima){
        this.cantidadMaxima = cantidadMaxima;
        this.cantidadInstrumento = 0;
        this.listaInstrumento = new Instrumento[cantidadMaxima];
    }
    /**
     * Obtiene la cantidad actual de instrumentos en la lista.
     *
     * @return La cantidad de instrumentos en la lista.
     */
    public int getCantidadInstrumento() {
        return cantidadInstrumento;
    }
    /**
     * Obtiene la cantidad máxima de instrumentos que puede contener la lista.
     *
     * @return La cantidad máxima de instrumentos.
     */
    public int getCantidadMaxima() {
        return cantidadMaxima;
    }
    /**
     * Agrega un instrumento de cuerda a la lista.
     *
     */
    public static void agregarInstrumentoCuerda() throws FileNotFoundException {
        int stockInstrumentoCuerda = 0;
        String Cuerda = "Cuerda";

        Scanner sc = new Scanner(System.in);
        String respuesta;
        boolean agregarMasInstrumentos = true;



        while (agregarMasInstrumentos) {
            String Instrumento = null;
            System.out.println("Ingrese el Instrumento (Guitarra , Bajo , Violin , Arpa): ");
            Instrumento = sc.nextLine();

            String tipoMaterial = null;
            System.out.println("Ingrese el tipo de material de construccion (Madera , metal): ");
            tipoMaterial = sc.nextLine();

            int codigoInstrumento = 0;
            System.out.println("Ingrese el codigo del instrumento (Guitarra = 1) (Bajo = 2) (Violin = 3) (Arpa = 4): ");
            codigoInstrumento = Integer.parseInt(sc.nextLine());

            int precioInstrumento = 0;
            System.out.println("Ingrese el precio del instrumento: ");
            precioInstrumento = Integer.parseInt(sc.nextLine());

            String tipoCuerda = null;
            System.out.println("Ingrese el tipo de cuerda (Nylon , acero , tripa): ");
            tipoCuerda = sc.nextLine();

            int numeroCuerda = 0;
            System.out.println("Ingrese el numero de cuerdas: ");
            numeroCuerda = Integer.parseInt(sc.nextLine());

            String tipoSonido = null;
            System.out.println("Ingrese el tipo de sonido (Acustico , electrico): ");
            tipoSonido = sc.nextLine();

            stockInstrumentoCuerda++;

            try {

                Cuerda c1 = new Cuerda(Cuerda,tipoMaterial,codigoInstrumento,precioInstrumento,tipoCuerda,numeroCuerda,tipoSonido);
                FileWriter writer = new FileWriter("instrumentos.csv", true);

                writer.write("codigo  ,  precio  ,  stock  ,  tipo_intrumento  ,  instrumento  ,  tipo_cuerda  ,  numero_cuerdas  ,  material  ,  tipo_sonido  ,  altura");
                writer.write("\n");
                writer.write(String.valueOf(codigoInstrumento));
                writer.write(" , " + precioInstrumento);
                writer.write(" , " + stockInstrumentoCuerda);
                writer.write(" , " + Cuerda);
                writer.write(" , " + stockInstrumentoCuerda);
                writer.write(" , " + Instrumento);
                writer.write(" , " + tipoCuerda);
                writer.write(" , " + numeroCuerda);
                writer.write(" , " + tipoMaterial);
                writer.write(" , " + tipoSonido);
                writer.write(" , " + "null");
                writer.write("\n");  // Agregar una nueva línea al final del registro
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            // Preguntar si se desea agregar más instrumentos
            System.out.println("¿Desea agregar otro instrumento de cuerda? (s/n): ");
            respuesta = sc.nextLine();

            if (respuesta.equalsIgnoreCase("n")) {
                agregarMasInstrumentos = false;
            }
        }
    }
    /**
     * Agrega un instrumento de viento a la lista.
     *
     */
    public static void agregarInstrumentoViento() throws FileNotFoundException {
        String Viento = "Viento";

        Scanner sc = new Scanner(System.in);
        String respuesta;
        boolean agregarMasInstrumentos = true;

        int stockInstrumentoViento = 0;

        while (agregarMasInstrumentos) {
            String Instrumento = null;
            System.out.println("Ingrese el Instrumento (Trompeta , Saxofon , Clarinete , Flauta travesa): ");
            Instrumento = sc.nextLine();

            String tipoMaterial = null;
            System.out.println("Ingrese el tipo de Material (Madera , metal): ");
            tipoMaterial = sc.nextLine();

            int codigoInstrumento = 0;
            System.out.println("Ingrese el codigo del instrumento (Trompeta = 5) (Saxofon = 6) (Clarinete = 7) (Flauta traversa = 8): ");
            codigoInstrumento = Integer.parseInt(sc.nextLine());

            int precioInstrumento = 0;
            System.out.println("Ingrese el precio del instrumento: ");
            precioInstrumento = Integer.parseInt(sc.nextLine());

            stockInstrumentoViento++;

            try {
                Viento v1 = new Viento(Viento, tipoMaterial, codigoInstrumento, precioInstrumento);
                FileWriter writer = new FileWriter("instrumentos.csv", true);

                writer.write("codigo  ,  precio  ,  stock  ,  tipo_intrumento  ,  instrumento  ,  tipo_cuerda  ,  numero_cuerdas  ,  material  ,  tipo_sonido  ,  altura");
                writer.write("\n");
                writer.write(String.valueOf(codigoInstrumento));
                writer.write(" , " + precioInstrumento);
                writer.write(" , " + "null");
                writer.write(" , " + Viento);
                writer.write(" , " + stockInstrumentoViento);
                writer.write(" , " + Instrumento);
                writer.write(" , " + "null");
                writer.write(" , " + "null");
                writer.write(" , " + tipoMaterial);
                writer.write(" , " + "null");
                writer.write(" , " + "null");
                writer.write("\n");  // Agregar una nueva línea al final del registro
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            // Preguntar si se desea agregar otro instrumento
            System.out.println("¿Desea agregar otro instrumento de viento? (s/n): ");
            respuesta = sc.nextLine();

            if (respuesta.equalsIgnoreCase("n")) {
                agregarMasInstrumentos = false;
            }
        }
    }
    /**
     * Agrega un instrumento de percusión a la lista.
     *
     */
    public static void agregarInstrumentoPercusion() throws FileNotFoundException {
        String Percusion = "Percusion";

        Scanner sc = new Scanner(System.in);
        String respuesta;
        boolean agregarMasInstrumentos = true;

        int stockInstrumentoPercusion = 0;

        while (agregarMasInstrumentos) {
            String Instrumento = null;
            System.out.println("Ingrese el Instrumento (Bongo , Cajon , Campana Tubulares , Bombo): ");
            Instrumento = sc.nextLine();

            String tipoMaterial = null;
            System.out.println("Ingrese el tipo de Material: ");
            tipoMaterial = sc.nextLine();

            int codigoInstrumento = 0;
            System.out.println("Ingrese el codigo del instrumento (Bongo = 9) (Cajon = 10) (Camapana Tubulares = 11) (Bombo = 12): ");
            codigoInstrumento = Integer.parseInt(sc.nextLine());

            int precioInstrumento = 0;
            System.out.println("Ingrese el precio del instrumento: ");
            precioInstrumento = Integer.parseInt(sc.nextLine());

            String tipoPercusion = null;
            System.out.println("Ingrese el tipo de percusion: ");
            tipoPercusion = sc.nextLine();

            String altura = null;
            System.out.println("Ingrese la altura: ");
            altura = sc.nextLine();

            stockInstrumentoPercusion++;

            try {
                Percusion p1 = new Percusion(Percusion, tipoMaterial, codigoInstrumento, precioInstrumento, tipoPercusion, altura);
                FileWriter writer = new FileWriter("instrumentos.csv", true);

                writer.write("codigo  ,  precio  ,  stock  ,  tipo_intrumento  ,  instrumento  ,  tipo_cuerda  ,  numero_cuerdas  ,  material  ,  tipo_sonido  ,  altura");
                writer.write("\n");
                writer.write(String.valueOf(codigoInstrumento));
                writer.write(" , " + precioInstrumento);
                writer.write(" , " + stockInstrumentoPercusion);
                writer.write(" , " + Percusion);
                writer.write(" , " + stockInstrumentoPercusion);
                writer.write(" , " + Instrumento);
                writer.write(" , " + "null");
                writer.write(" , " + "null");
                writer.write(" , " + tipoMaterial);
                writer.write(" , " + tipoPercusion);
                writer.write(" , " + altura);
                writer.write("\n");  // Agregar una nueva línea al final del registro
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            // Preguntar si se desea agregar otro instrumento
            System.out.println("¿Desea agregar otro instrumento de percusion? (s/n): ");
            respuesta = sc.nextLine();

            if (respuesta.equalsIgnoreCase("n")) {
                agregarMasInstrumentos = false;
            }
        }
    }
    /**
     * Vende un instrumento.
     *
     */
    public static void venderInstrumento() throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);
        String opcion = null;

        while(!Objects.equals(opcion, "4")){

            System.out.println("♫♬♪♩  Vender Instrumento  ♫♬♪♩");
            System.out.println();
            System.out.println("Inventario:");

            consultarInventario();

            System.out.println();
            System.out.println();
            System.out.println("[4] Volver atras");
            System.out.println();
            System.out.println("Ingrese el codigo del intrumento a vender: ");
            int codigoInstrumento = Integer.parseInt(sc.nextLine());

            String linea = String.valueOf(codigoInstrumento);

            switch (opcion){
                case "4" -> System.out.println();
                default -> System.out.println("Opcion invalida");
            }
        }

    }
    /**
     * Consulta el inventario de instrumentos.
     */
    public static void consultarInventario() {

        String file = "instrumentos.csv";
        BufferedReader reader = null;
        String line = "";

        try {
            reader = new BufferedReader(new FileReader(file));
            while((line = reader.readLine()) !=null){

                String [] row = line.split(",");

                for (String index : row){
                    System.out.printf("%-10s", index);
                }
                System.out.println();
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
