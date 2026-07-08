/*Faça um programa em Java que leia dois números inteiros digitados pelo usuário, 
calcule a soma entre eles e exiba o resultado na tela no seguinte formato:
resultado de N1 + N2 = RESULTADO
*/

package com.mycompany.mavenproject1;

import java.util.Scanner;

public class EXERCICIO_1_KLEITON {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int num1 = 0, num2 = 0, resultado = 0;

        System.out.println("Digite o primeiro número;");
        num1 = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        num2 = scanner.nextInt();

        resultado = num1 + num2;

        System.out.println("O resultado de " + num1 + " + " + num2 + " = " + resultado);
        
        scanner.close();
    }
}
