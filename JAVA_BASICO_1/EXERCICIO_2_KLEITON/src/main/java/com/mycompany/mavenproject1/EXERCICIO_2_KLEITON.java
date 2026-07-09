/*
Faça um programa em Java que leia dois números inteiros digitados pelo usuário. 
Caso os dois números sejam positivos, calcule e exiba a soma entre eles no seguinte formato:
Soma de N1 com N2 = RESULTADO
Caso algum dos números seja zero ou negativo, exiba a mensagem:
Dados de entrada sao invalidos
*/

package com.mycompany.mavenproject1;

import java.util.Scanner;

public class EXERCICIO_2_KLEITON {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int num1 = 0, num2 = 0, resultado = 0;

        System.out.println("Digite o primeiro número: ");
        num1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        num2 = scanner.nextInt();

        if (num1 > 0 && num2 > 0) {
            resultado = num1 + num2;
            System.out.println("Soma de " + num1 + " + " + num2 + " = " + resultado);
        } else {
            System.out.println("Dados de entrada são invalidos!");
        }

        scanner.close();
    }
}
