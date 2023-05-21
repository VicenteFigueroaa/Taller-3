public class Cuerda extends Instrumento {

    private String tipoDeCuerda;

    private int numeroDeCuerda;

    private String tipo;


    public Cuerda(String tipoDeInstrumento, String tipoDeMaterial, int codigoDeInstrumento, int precioDelInstrumento, String tipoDeCuerda, int numeroDeCuerda, String tipo) {
        super(tipoDeInstrumento, tipoDeMaterial, codigoDeInstrumento, precioDelInstrumento);
        this.tipoDeCuerda = tipoDeCuerda;
        this.numeroDeCuerda = numeroDeCuerda;
        this.tipo = tipo;
    }

    public String getTipoDeCuerda() {
        return tipoDeCuerda;
    }

    public void setTipoDeCuerda(String tipoDeCuerda) {
        this.tipoDeCuerda = tipoDeCuerda;
    }

    public int getNumeroDeCuerda() {
        return numeroDeCuerda;
    }

    public void setNumeroDeCuerda(int numeroDeCuerda) {
        this.numeroDeCuerda = numeroDeCuerda;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
