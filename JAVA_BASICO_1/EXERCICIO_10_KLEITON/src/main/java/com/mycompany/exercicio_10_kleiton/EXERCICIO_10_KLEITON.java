/*
Faça um programa em Java que leia um valor inteiro `N`, representando a quantidade de elementos de um vetor.
O valor de `N` deve estar entre `0` e `50`. Caso o valor informado esteja fora desse intervalo,
o programa deverá exibir uma mensagem de erro e encerrar.
Em seguida, leia `N` valores reais e armazene-os em um vetor chamado `A`.
Depois, separe os valores lidos em dois vetores/listas:
* `NEG`: deve armazenar os valores negativos;
* `POS`: deve armazenar os valores positivos e o valor zero.
Ao final, o programa deverá exibir:
* todos os valores armazenados em `NEG`;
* a quantidade de valores em `NEG`;
* todos os valores armazenados em `POS`;
* a quantidade de valores em `POS`.
*/

package com.mycompany.exercicio_10_kleiton;

import java.util.ArrayList;
import java.util.Scanner;

public class EXERCICIO_10_KLEITON {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de elementos do vetor:");
        int n = scanner.nextInt();

        if (n < 0 || n > 50) {
            System.out.println("O valor de N deve estar entre 0 e 50.");
            scanner.close();
            return;
        }

        double[] A = new double[n];
        ArrayList<Double> NEG = new ArrayList<>();
        ArrayList<Double> POS = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o " + (i + 1) + "º valor:");
            A[i] = scanner.nextDouble();

            if (A[i] < 0) {
                NEG.add(A[i]);
            } else {
                POS.add(A[i]);
            }
        }

        System.out.println("Vetor NEG (valores negativos):");
        for (double num : NEG) {
            System.out.println(num);
        }
        System.out.println("Quantidade de valores em NEG: " + NEG.size());

        System.out.println("Vetor POS (valores positivos e zero):");
        for (double num : POS) {
            System.out.println(num);
        }
        System.out.println("Quantidade de valores em POS: " + POS.size());

        scanner.close();
    }
}
