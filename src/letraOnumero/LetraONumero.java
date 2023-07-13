package letraOnumero;

/**
 *==== Problema =====
 * 
 * Estamos desarrollando un sistema web para la venta de
 * automóviles usados. Una de las informaciones necesarias para registrar un
 * automóvil en el sistema es el número de placa del vehículo.
 *
 * Necesitamos crear una funcionalidad que valide las placas del carro, para que
 * los usuarios no salgan enviando para el servidor datos incorrectos. Una placa
 * de carro válida por ejemplo seria "FXZ-9846" y una inválida “FX4-Z432”. Para
 * hacer tal validación necesitamos seguir algunas reglas, siendo ellas:
 *
 * 1. Número de caracteres tiene que ser igual a 7
 * 2. Los 3 primeros caracteres son letras 
 * 3. Los 4 últimos caracteres son dígitos
 * 
 */
public class LetraONumero {
    
    // primero crearemos un metodo que recibe una placa y devuelve un boolean
    // para hacer la verificacion de lo que fue insertado
    
    public static boolean validaPlaca(String placa){
        boolean valido = true;  // variable que sera nuestro retorno desp de validaciones
        
        //1er validacion:
        // los caracteres de una placa deben ser igual 7.
        if(placa.length() != 7){
            valido = false;
        }
        // ahora vamos a validar que los tres primeros caracteres sean letras
        if(! placa.substring(0, 3).matches("[A-Z]*")){
            valido = false;
        }
        // verificamos que los ultimos cuatro digitos sean numeros
        if(! placa.substring(3).matches("[0-9]*")){
            valido = false;
        }
        
        return valido;
    }
    
    public static void main(String[] args) {
        
        // PROBAMOS EL METODO
        System.out.println(validaPlaca("FXZ4765")); // TRUE
        System.out.println(validaPlaca("Fz39139")); // FALSE
        
        
        
    }
}
