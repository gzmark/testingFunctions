package figures;

/**
 *
 * @author MSI
 */
public class Main {

    public static void main(String[] args) {

        Triangulo t1 = new Triangulo("verde", 10, 20, 15, 18);

        System.out.println(t1.toString());
        t1.area();
        t1.perimetro();

    }

}
