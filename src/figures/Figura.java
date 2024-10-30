/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figures;

/**
 *
 * @author MSI
 */
public abstract class Figura {

    String color;

    public Figura(String c) {
        color = c;
    }

    public void area() {
    }

    public void perimetro() {
    }

    @Override
    public String toString() {
        return color + " ";
    }

}
