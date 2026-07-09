/*
Faça um programa em Java que leia números inteiros repetidamente.
Para cada número informado, o programa deve verificar se ele é positivo ou negativo.
Se o número for maior que zero, exiba:
Positivo
Se o número for menor que zero, exiba:
Negativo
O programa deve continuar lendo números até que seja digitado o valor 0.
Quando o valor 0 for digitado, o programa deve encerrar sem exibir classificação para ele.
*/

package com.mycompany.exercicio_6_kleiton;

import java.util.Scanner;

public class EXERCICIO_6_KLEITON {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int numero = 0;

        do {

        System.out.println("Digite um número:");
        numero = scanner.nextInt();

            if (numero > 0) {
                System.out.println("Positivo");
            } else if (numero < 0) {
                System.out.println("Negativo");
            }
            
        } while (numero != 0);
        System.out.println("Programa finalizado!");

        scanner.close();
    }
}

