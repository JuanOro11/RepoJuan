public class PoligonoRegular {

    protected final String LISTACOLORES [] = {"NEGRO","VERDE","ROJO","AZUL"};

    public static final int COLORNEGRO= 0;
    public static final int COLORVERDE= 1;
    public static final int COLORROJO= 2;
    public static final int COLORAZUL= 3;

    protected static final int COLORESTANDAR = 0;
    protected static final double LONGITUDESTANDAR = 10;
    public String Color;

    protected double Perimetro;
    protected double Supericie;

    protected int NumLados;
    protected double LongitudLado;
    protected boolean Relleno;
    protected double Rotado;

    public double perimetro() {
        this.Perimetro = this.LongitudLado * this.NumLados;
        return this.Perimetro;
    }

    public void agrandar(double porcentaje) {
        if (porcentaje > 0) {
            this.LongitudLado = this.LongitudLado + this.LongitudLado*(porcentaje/100);
        }
    }

    public void reducir(double porcentaje) {
        if (porcentaje > 0) {
            this.LongitudLado = this.LongitudLado - this.LongitudLado*(porcentaje/100);
        }
        if (this.LongitudLado < 0) {
            this.LongitudLado = 0;
        }
    }

    public void setLongitudLado(double longitudLado) {
        this.LongitudLado = longitudLado;
    }

    public void setColor(int color) {
        if (color < this.LISTACOLORES.length) {
            this.Color = this.LISTACOLORES[color];
        }
        else {
            throw new IllegalArgumentException("Color no valido");
        }
    }

    public String getColor() {
        return this.Color;
    }
}
