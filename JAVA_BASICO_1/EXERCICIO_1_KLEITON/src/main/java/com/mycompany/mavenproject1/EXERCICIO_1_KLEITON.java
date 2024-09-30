package com.mycompany.mavenproject1;

import java.util.Scanner;

public class EXERCICIO_1_KLEITON {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        
        int soma = num1 + num2;
        System.out.println("Soma de " + num1 + " com " + num2 + " = " + soma);
        
        scanner.close();
    }
}
