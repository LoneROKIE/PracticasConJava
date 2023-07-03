
package excepcionesPersonalizadas;

public class TestExcepcionPersonalizada {
    
    public static void main(String[] args) {
        
        try {
            try {
                validar(10);
            } catch (EdadInvalidaExcepcion ex) {
                System.out.println("excepcion atrapada: "+ ex);
            }
            
            validar(20);     
        } catch (EdadInvalidaExcepcion ex) {
             System.out.println("excepcion atrapada: "+ex);
        }    
    }
    public static void validar(int edad) throws EdadInvalidaExcepcion{
        
        if(edad < 18){
            throw new EdadInvalidaExcepcion("Aun es menor de edad");
        }else{
            System.out.println("Ya es mayor de edad, puedes tomar cerveza !!!");
        } 
    }  
}
