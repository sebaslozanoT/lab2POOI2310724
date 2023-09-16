/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana05pooi;

import java.util.Scanner;

/**
 *
 * @author fernandogupioc
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        int total = 0;
        int contador = 0;

        System.out.print("Ingresa un numero (Si no, ingresa -1 para terminar): ");
        int numero = input.nextInt();

        while (numero != -1) {
            if (numero > 0) {
                total += numero;
                contador++;
            }
            System.out.print("Ingresa un numero (Si no, ingresa -1 para terminar): ");
            numero = input.nextInt();
        }

        if (contador > 0) {
            double promedio = (double) total / contador;
            System.out.println("La suma total de los " + contador + " numeros ingresados es " + total);
            System.out.printf("El promedio de los %d números ingresados es %.2f", contador, promedio);
        } else {
            System.out.println("No se ingresaron números válidos.");
        }

        input.close();
    }
}