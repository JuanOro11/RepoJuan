public class TrianguloHijo extends PoligonoRegular{

    public TrianguloHijo(double longitud) {
        this(longitud,COLORESTANDAR);
    }

    public TrianguloHijo(double longitud, int color) {
        this.NumLados = 3;
        this.LongitudLado = longitud;
        setColor(color);
    }

    public TrianguloHijo() {
        this(LONGITUDESTANDAR,COLORESTANDAR);
    }
}
