package com.mycompany.exercicio_15_kleiton;

import java.util.Scanner;

public class EXERCICIO_15_KLEITON {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();
        
        System.out.print("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();
        
        int idade = anoAtual - anoNascimento;
        
        System.out.println("A idade do usuario no ano atual e: " + idade + " anos.");
        
        scanner.close();
    }
}
