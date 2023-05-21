/**
 * Clase que representa un instrumento de percusión.
 */
public class Percusion extends Instrumento{

    private String tipoDePercusion;

    private String altura;
    /**
     * Constructor.
     *
     * @param tipoDeInstrumento
     * @param tipoDeMaterial
     * @param codigoDeInstrumento
     * @param precioDelInstrumento
     * @param tipoDePercusion
     * @param altura
     */
    public Percusion(String tipoDeInstrumento, String tipoDeMaterial, int codigoDeInstrumento, int precioDelInstrumento, String tipoDePercusion, String altura) {
        super(tipoDeInstrumento, tipoDeMaterial, codigoDeInstrumento, precioDelInstrumento);
        this.tipoDePercusion = tipoDePercusion;
        this.altura = altura;
    }
    /**
     * Obtiene el tipo de percusión del instrumento.
     *
     * @return El tipo de percusión.
     */
    public String getTipoDePercusion() {
        return tipoDePercusion;
    }
    /**
     * Establece el tipo de percusión del instrumento.
     *
     * @param tipoDePercusion El tipo de percusión a establecer.
     */
    public void setTipoDePercusion(String tipoDePercusion) {
        this.tipoDePercusion = tipoDePercusion;
    }
    /**
     * Obtiene la altura del instrumento de percusión.
     *
     * @return La altura del instrumento de percusión.
     */
    public String getAltura() {
        return altura;
    }
    /**
     * Establece la altura del instrumento de percusión.
     *
     * @param altura La altura a establecer.
     */
    public void setAltura(String altura) {
        this.altura = altura;
    }
}
