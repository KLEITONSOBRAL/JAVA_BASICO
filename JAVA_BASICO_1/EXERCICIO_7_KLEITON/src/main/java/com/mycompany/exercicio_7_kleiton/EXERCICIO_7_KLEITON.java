/*Faça um programa em Java que leia números inteiros positivos digitados pelo usuário.
A leitura deve continuar enquanto forem informados valores positivos.
Quando o usuário digitar um valor menor ou igual a zero, o programa deve encerrar a leitura.
Ao final, caso tenha sido informado pelo menos um valor positivo, o programa deve exibir:
Maior valor informado
Menor valor informado
Quantidade de valores positivos informados
Soma dos valores
Média dos valores
Caso nenhum valor positivo seja informado, o programa deve exibir:
Nenhum valor positivo foi informado.
*/

package com.mycompany.exercicio_7_kleiton;

import java.util.Scanner;

public class EXERCICIO_7_KLEITON {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int valor = 0, soma = 0, quantidade = 0, maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
        double media = 0;

        do {
            System.out.println("Digite um número: ");
            valor = scanner.nextInt();

            if (valor > 0) {
                if (valor > maior) {
                    maior = valor;
                }

                if (valor < menor) {
                    menor = valor;
                }
                soma += valor;
                quantidade++;
            }

        } while (valor > 0);

        if (quantidade > 0) {
            media = (double) soma / quantidade;

            System.out.println("Maior valor: " + maior);
            System.out.println("Menor valor: " + menor);
            System.out.println("Quantidade de valores: " + quantidade);
            System.out.println("Soma: " + soma);
            System.out.println("Media: " + media);
        } else {
            System.out.println("Nenhum valor positivo foi informado.");
        }

        scanner.close();
    }
}
