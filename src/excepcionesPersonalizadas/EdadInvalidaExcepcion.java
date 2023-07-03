
package excepcionesPersonalizadas;

public class EdadInvalidaExcepcion extends Exception {
    /*
      para crear una excepcion personalizada , 
      hay que heredar de la clase exception
      o heredar de la clase RunTimeException
    */
    
    //constructor
    public EdadInvalidaExcepcion(String mensaje){
        super(mensaje);
    }
    
    
}
