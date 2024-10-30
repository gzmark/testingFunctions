package cars;

import java.util.Arrays;

public class CarreraDeCoches {

    public static void main(String[] args) {
        // Definir el número de coches
        int n = 3;

        // Inicializar velocidades iniciales
        double[] velocidades = {100, 150, 120}; // Velocidades iniciales de cada coche

        // Inicializar resistencia del aire (puede cambiar en diferentes momentos)
        double k = 0.1;

        // Simular la carrera
        for (int t = 0; t < 10; t++) { // Simulación de 10 unidades de tiempo
            // Calcular cambios en las velocidades usando el método de Euler
            for (int i = 0; i < n; i++) {
                double aceleracion = -k * Math.pow(velocidades[i], 2);
                velocidades[i] += aceleracion * 1; // Supongamos un paso de tiempo de 1 unidad
            }

            // Imprimir las velocidades en cada momento
            System.out.println("Tiempo " + t + ": " + Arrays.toString(velocidades));
        }
    }
}
