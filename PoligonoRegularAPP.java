public class PoligonoRegularAPP {

    public static void main(String[] args) {
        TrianguloHijo tri1 = new TrianguloHijo();
        TrianguloHijo tri2 = new TrianguloHijo(10,PoligonoRegular.COLORVERDE);
        CuadradoHijo cua = new CuadradoHijo(20,PoligonoRegular.COLORESTANDAR);

        System.out.println(tri1.perimetro());
        System.out.println(tri2.perimetro());
        System.out.println(cua.perimetro());

        Hexagono hex = new Hexagono();
    }

}

