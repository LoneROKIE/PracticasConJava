
package TemporizadorSimplePractica;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/*
  Practica sencilla, es un temporizador de 10 min
  esta pequenio ejemplo es para guiarme mas adelante.
*/

public class Temporizador {
    public static void main(String[] args) {
        Timer timer = new Timer();

        TimerTask tarea = new TimerTask() {
            private int minutos = 10;
            private int segundos = 0;

            @Override
            public void run() {
                segundos--;
                if (segundos < 0) {
                    minutos--;
                    segundos = 59;
                }
                if (minutos < 0) {
                    System.out.println("Tiempo finalizado.");
                    cancel(); // Detener el temporizador
                } else {
                    System.out.printf("%02d:%02d\n", minutos, segundos);
                }
            }
        };

        timer.schedule(tarea, 0, 1000);
    }
}
