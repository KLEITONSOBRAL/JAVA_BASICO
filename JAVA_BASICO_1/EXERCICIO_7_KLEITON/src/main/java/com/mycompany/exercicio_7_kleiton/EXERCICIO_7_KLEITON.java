package com.mycompany.exercicio_7_kleiton;

import java.util.Scanner;

public class EXERCICIO_7_KLEITON {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor, maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE, soma = 0, quantidade = 0;

        while (true) {
            valor = scanner.nextInt();
            if (valor <= 0) {
                break;
            }

            if (valor > maior) {
                maior = valor;
            }

            if (valor < menor) {
                menor = valor;
            }

            soma += valor;
            quantidade++;
        }

        if (quantidade > 0) {
            double media = (double) soma / quantidade;
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
