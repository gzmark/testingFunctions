package figures;

/**
 *
 * @author MSI
 */
public class Triangulo extends Figura {

    int base;
    int altura;
    int ladoA;
    int ladoB;

    public Triangulo(String c, int b, int a, int lA, int lB) {
        super(c);
        base = b;
        altura = a;
        ladoA = lA;
        ladoB = lB;

    }

    @Override
    public void area() {
        System.out.println((base * altura) / 2);
    }

    @Override
    public void perimetro() {
        System.out.println(base + ladoA + ladoB);
    }

    @Override
    public String toString() {
        return super.toString() + "base: " + base;
    }

}
