package ejercicio.pkg2_2;

public class Circulo extends FiguraCircular {

    public Circulo(int radio) {
        super(radio);
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String imprimeFigura() {
        return super.imprimeFigura() + "\n"
             + String.format(
                 "Se imprime un Circulo con radio: %d, area: %.2f, perimetro: %.2f",
                 radio, calcularArea(), calcularPerimetro());
    }
}