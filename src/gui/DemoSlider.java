
// prueba de MarcoSlider
package gui;

import javax.swing.JFrame;

public class DemoSlider {
    public static void main(String[] args) {
        MarcoSlider marcoSlider = new MarcoSlider();
        marcoSlider.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoSlider.setSize(220,270); // establece el tamanio del marco
        marcoSlider.setVisible(true); // muestra el marco
    }
}
