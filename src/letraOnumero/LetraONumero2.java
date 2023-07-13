
package letraOnumero;

/**
 *
 *  Si pasamos un guion -
 *  en el metodo de la clase LetraONumero probablemente nos retorne
 *  false asi que para corregir eso agregamos el siguiente codigo
 */
public class LetraONumero2 {
    
    public static boolean validaPlaca(String placa){
        boolean valido = true;
        
        placa = placa.replaceAll("[^a-zA-Z0-9]", "");
        if(placa.length() != 7 ){
            valido = false;
        }
        if(!placa.substring(0,3).matches("[A-Z]*")){
            valido = false;
        }
        if(!placa.substring(3).matches("[0-9]*")){
            valido = false;
        }
        
        
        return valido;
    }

    public static void main(String[] args) {
        // testeamos los cambios
        System.out.println(validaPlaca("FXZ-4765")); // ahora devuelve true
    }
}
