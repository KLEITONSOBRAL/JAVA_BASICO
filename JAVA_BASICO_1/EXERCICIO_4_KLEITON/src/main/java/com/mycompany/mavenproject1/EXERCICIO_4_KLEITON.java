/*Faça um programa em Java que leia três valores reais representando os lados de um triângulo.
O programa deve verificar se os valores fornecidos podem formar um triângulo.
Caso possam, classifique o triângulo como:
Triangulo Equilatero — quando os três lados forem iguais.
Triangulo Isosceles — quando dois lados forem iguais.
Triangulo Escaleno — quando os três lados forem diferentes.
Caso os valores informados não formem um triângulo, exiba a mensagem:
Os valores fornecidos nao formam um triangulo
*/

package com.mycompany.mavenproject1;

import java.util.Scanner;

public class EXERCICIO_4_KLEITON {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double lado1 = 0,lado2 = 0, lado3 = 0;

        System.out.println("Digite o primeiro lado no triângulo: ");
        lado1 = scanner.nextDouble();

        System.out.println("Digite o segundo lado do triângulo: ");
        lado2 = scanner.nextDouble();

        System.out.println("Digite o terceiro lado do triângulo: ");
        lado3 = scanner.nextDouble();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triângulo Equilatero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo Isosceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Os valores fornecidos não formam um triângulo");
        }

        scanner.close();
    }
}
