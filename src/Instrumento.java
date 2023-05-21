public class Instrumento {

    private String tipoDeInstrumento;

    private String tipoDeMaterial;

    private int codigoDeInstrumento;

    private int PrecioDelInstrumento;
    /**
     * Constructor de la clase Instrumento.
     *
     * @param tipoDeInstrumento
     * @param tipoDeMaterial
     * @param codigoDeInstrumento
     * @param PrecioDelInstrumento
     */
    public Instrumento(String tipoDeInstrumento, String tipoDeMaterial, int codigoDeInstrumento, int PrecioDelInstrumento){
        this.tipoDeInstrumento = tipoDeInstrumento;
        this.tipoDeMaterial = tipoDeMaterial;
        this.codigoDeInstrumento = codigoDeInstrumento;
        this.PrecioDelInstrumento = PrecioDelInstrumento;
    }
    /**
     * Obtiene el tipo de instrumento.
     *
     * @return El tipo de instrumento.
     */
    public String getTipoDeInstrumento() {
        return tipoDeInstrumento;
    }
    /**
     * Establece el tipo de instrumento.
     *
     * @param tipoDeInstrumento El tipo de instrumento a establecer.
     */
    public void setTipoDeInstrumento(String tipoDeInstrumento) {
        this.tipoDeInstrumento = tipoDeInstrumento;
    }
    /**
     * Obtiene el tipo de material del instrumento.
     *
     * @return El tipo de material del instrumento.
     */
    public String getTipoDeMaterial() {
        return tipoDeMaterial;
    }
    /**
     * Establece el tipo de material del instrumento.
     *
     * @param tipoDeMaterial El tipo de material del instrumento a establecer.
     */
    public void setTipoDeMaterial(String tipoDeMaterial) {
        this.tipoDeMaterial = tipoDeMaterial;
    }
    /**
     * Obtiene el código del instrumento.
     *
     * @return El código del instrumento.
     */
    public int getCodigoDeInstrumento() {
        return codigoDeInstrumento;
    }
    /**
     * Establece el código del instrumento.
     *
     * @param codigoDeInstrumento El código del instrumento a establecer.
     */
    public void setCodigoDeInstrumento(int codigoDeInstrumento) {
        this.codigoDeInstrumento = codigoDeInstrumento;
    }
    /**
     * Obtiene el precio del instrumento.
     *
     * @return El precio del instrumento.
     */
    public int getPrecioDelInstrumento() {
        return PrecioDelInstrumento;
    }
    /**
     * Establece el precio del instrumento.
     *
     * @param precioDelInstrumento El precio del instrumento a establecer.
     */
    public void setPrecioDelInstrumento(int precioDelInstrumento) {
        PrecioDelInstrumento = precioDelInstrumento;
    }
}
