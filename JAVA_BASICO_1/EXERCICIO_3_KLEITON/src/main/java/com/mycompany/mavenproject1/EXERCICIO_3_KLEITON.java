package com.mycompany.mavenproject1;

import java.util.Scanner;

public class EXERCICIO_3_KLEITON {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        
        if ((num1 >= 0 && num2 >= 0) || (num1 < 0 && num2 < 0)) {
            int soma = num1 + num2;
            System.out.println("Soma de " + num1 + " com " + num2 + " = " + soma);
        } else {
            System.out.println("Dados de entrada sao invalidos");
        }
        
        scanner.close();
    }
}
