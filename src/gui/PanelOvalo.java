
package gui;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;


public class PanelOvalo extends JPanel {
       private int diametro = 10; // diametro predeterminado de 10
    
    // dibuja un ovalo del diametro especificado
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        g.fillOval(10, 10, diametro, diametro);
    } // fin del metodo paintComponent
    
    //valida y establece el diametro,despues vuelve a pintar
    public void establecerDiametro(int nuevoDiametro){
        // si el diametro es invalido, usa el valor predeterminadod de 10
        diametro = (nuevoDiametro >= 0 ? nuevoDiametro : 10);
        repaint();// vuelve a pintar el panel
    } // fin del metodo establecer diametro
    
    // lo utiliza el administrador de esquemas para determinar el tamanio preferido
    public Dimension GetPreferredSize(){
        return new Dimension(200,200);
    }// fin del metodo getPreferredSize
    
    // lo utiliza el administrador de esquemas para determinar el tamanio minimo
    public Dimension getMinimumSize(){
        return getPreferredSize();
    } // fin del metodo getMinimumSize 
}
