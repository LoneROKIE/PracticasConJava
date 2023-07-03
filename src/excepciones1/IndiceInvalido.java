package excepciones1;

import java.util.Scanner;

/*
INSTRUCCIONES DEL EJERCICIO

Crea un arreglo de enteros con algunos valores predefinidos. Luego, 
pide al usuario que ingrese un índice y muestra el valor correspondiente 
en el arreglo. Asegúrate de manejar la excepción en caso de que el índice 
ingresado sea inválido.

 */
public class IndiceInvalido {

    public static void main(String[] args) {

        int[] arreglo = {1, 2, 3, 4, 5, 7}; // indice 5
        Scanner scan = new Scanner(System.in);
        boolean validador;
        do {
            try {
                System.out.println("Digite el indice un indice del 0 al 5");
                int numeroIndice = scan.nextInt();
                System.out.println(arreglo[numeroIndice]); // imprime el numero en el indice que digito el usuario.
                validador = true;
            } catch (Exception ex) {
                validador = false;
                ex.printStackTrace();
                System.out.println("Error Digite el indice de nuevo");
            }
        } while (validador == false);
        System.out.println("Fin del programa");
    }
}

  
