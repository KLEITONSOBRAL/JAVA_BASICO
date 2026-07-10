/*
Faça um programa em Java que leia o ano de nascimento de uma pessoa e o ano atual.
Em seguida, calcule a idade da pessoa no ano atual e exiba o resultado na tela.
A saída deve seguir o formato:
A idade do usuario no ano atual é: IDADE anos.
*/

package com.mycompany.exercicio_15_kleiton;

import java.util.Scanner;

public class EXERCICIO_15_KLEITON {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        System.out.println("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();

        int idade = anoAtual - anoNascimento;

        System.out.println("A idade do usuario no ano atual é " + idade + " anos.");

        scanner.close();
    }
}
