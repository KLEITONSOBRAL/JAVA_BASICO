/*
Faça um programa em Java que leia dois números inteiros digitados pelo usuário.
O programa deve calcular e exibir a soma dos números apenas se os dois forem do mesmo tipo de sinal,
ou seja, ambos positivos ou iguais a zero, ou ambos negativos.
Caso um número seja positivo ou zero e o outro seja negativo, exiba a mensagem:
Dados de entrada sao invalidos
A saída da soma deve seguir o formato:
Soma de N1 com N2 = RESULTADO
*/

package com.mycompany.mavenproject1;

import java.util.Scanner;

public class EXERCICIO_3_KLEITON {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int num1 = 0,num2 = 0, resultado = 0;

        System.out.println("Digite o primeiro número: ");
        num1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        num2 = scanner.nextInt();

        if ((num1 >= 0 && num2 >= 0) || (num1 < 0 && num2 < 0)) {
            resultado = num1 + num2;
            System.out.println("Soma de " + num1 + " com " + num2 + " = " + resultado);
        } else {
            System.out.println("Dados de entrada são invalidos");
        }

        scanner.close();
    }
}
