public class CuadradoHijo extends PoligonoRegular{

    public CuadradoHijo(double longitud, int color) {
        this.NumLados = 4;
        this.LongitudLado = longitud;
        setColor(color);
    }

    public CuadradoHijo() {
        this(LONGITUDESTANDAR,COLORESTANDAR);
    }
}
