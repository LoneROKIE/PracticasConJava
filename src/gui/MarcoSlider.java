// uso de objetos JSlider para cambiar el tamanio de un ovalo
package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class MarcoSlider extends JFrame {
    
private JSlider diametroJSlider; // control deslizable para seleccionar el diametro

private PanelOvalo miPanel; // panel para dibujar el circulo

//constructor sin args
public MarcoSlider(){
    super("Demostracion de JSlider");
    
    miPanel = new PanelOvalo(); // crea panel para dibujar el circulo
    miPanel.setBackground(Color.YELLOW); // establece el color del fondo en amarillo
    
    //establece objeto JSlider para controlar el valor del diametro
    diametroJSlider = new JSlider(SwingConstants.HORIZONTAL,0,200,10);
    
    diametroJSlider.setMajorTickSpacing(10); // crea una marca cada 10
    diametroJSlider.setPaintTicks(true); // dibuja las marcas  en el control deslizable
    
    //registra el componente que escucha los eventos del objeto JSlider
    diametroJSlider.addChangeListener(
         new ChangeListener() // clase interna anonima
         {
         //maneja el cambio en el valor del control deslizable
            public void stateChanged(ChangeEvent e){
                miPanel.establecerDiametro(diametroJSlider.getValue());
            } // fin del metodo stateChanged
         } // fin de la clase interna anonima
    ); // fin de la llamada a addChangeListener
    
    add( diametroJSlider , BorderLayout.SOUTH ); //agrega el control deslizable al marco
    add(miPanel, BorderLayout.CENTER); // agrega el panel al marco
    
} // fin del constructor    
} // fin de la clase MarcoSlider
