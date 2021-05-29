package ar.com.ada.creditos;

import java.util.Scanner;

public class Validador {

    //Se trabaja en un método que permita validar los ingresos del usuario.
    public  int validarEleccionMenu() {

        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            String ANSI_PURPLE;
            String ANSI_CYAN;
            System.out.println(ANSI_PURPLE + " Ingrese una opción ----->");
            System.out.println(ANSI_CYAN
                    + "═════════════════════════════════════════════════════════════════════════════════════════");
            while (!sc.hasNextInt()) {
                System.out.println(ANSI_PURPLE + "La opción ingresada no es un número.");
                sc.next();
            }
            opcion = sc.nextInt();
            sc.nextLine();
        } while (opcion < 0 || opcion > 4);

        return opcion;
    }
}
