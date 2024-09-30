package com.mycompany.mavenproject1;

import java.util.Scanner;

public class EXERCICIO_4_KLEITON {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double lado1 = scanner.nextDouble();
        double lado2 = scanner.nextDouble();
        double lado3 = scanner.nextDouble();
        
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triangulo Equilatero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triangulo Isosceles");
            } else {
                System.out.println("Triangulo Escaleno");
            }
        } else {
            System.out.println("Os valores fornecidos nao formam um triangulo");
        }
        
        scanner.close();
    }
}
