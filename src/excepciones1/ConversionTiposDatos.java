
package excepciones1;

import java.util.Scanner;

/*
Conversión de tipos de datos:
Escribe un programa que le pida al usuario que ingrese un número entero y 
luego intente convertirlo a un tipo de dato diferente, como un número de 
punto flotante. Maneja la excepción en caso de que la conversión falle.
*/

public class ConversionTiposDatos {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int numeroEntero; // numero entero a convertir
        int opcion; // numero entero que funciona como la opcion a elegir
        
        try{
            System.out.println("Digita el numero entero que quieres convertir: ");
            numeroEntero = scan.nextInt();    
            menu();
            opcion = scan.nextInt();
            switch(opcion){
                case 1: // opcion 1, convertir entero en flotante
                    float numeroFlotante = Float.intBitsToFloat(numeroEntero);
                    System.out.println("Numero entero: "+numeroEntero);
                    System.out.println("convertido en float: "+numeroFlotante);
                    break;
                case 2: // opcion 2, convertir entero en double
                    double numeroDouble = numeroEntero;
                    System.out.println("Numero entero: "+numeroEntero);
                    System.out.println("convertido en double: "+numeroDouble);
                    break;
                default: // opcion por defecto
                    System.out.println("Opcion invalida");
                    break;
            }   
        }catch(Exception ex){
            System.out.println("Ups. Hubo una excepcion: "+ex);
        }   
    }
   public static void menu(){
        System.out.println("Hola bienvenido a este conversor simple !!");
        System.out.println("[1] Digita 1 para convertir tu numero entero en un numero Flotante ");
        System.out.println("[2] Digita 2 para convertir tu numero entero en un numero double");        
    }
    
}
