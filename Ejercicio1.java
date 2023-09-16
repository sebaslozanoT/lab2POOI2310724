package semana05POOI;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un numero: ");

        if (scanner.hasNextInt()) {
            int numero = scanner.nextInt();
            scanner.close();

            if (numero >= 2 && numero <= 20) {
                for (int i = 1; i <= 10; i++) {
                    int resultado = numero * i;
                    System.out.println(numero + " x " + i + " = " + resultado);
                }
            } else {
                System.out.println("Numero inválido. Por favor, ingrese un numero que est3 en el rango (2 <= N <= 20).");
            }
        } else {
            System.out.println("Caracter inválido. Debes ingresar un numero.");
            scanner.close();
        }
    }
}