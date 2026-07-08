/*
Faça um programa em Java que leia um valor inteiro `N`, representando a quantidade de elementos de um vetor.
O valor de `N` deve estar entre `0` e `50`. Caso o valor informado esteja fora desse intervalo, o programa deverá exibir uma mensagem de erro e encerrar.
Em seguida, o programa deverá criar um vetor `V` com `N` posições e preencher esse vetor automaticamente com números inteiros aleatórios de `0` a `99`.
Depois de preencher o vetor, o programa deverá exibir todos os valores armazenados em `V`.
Em seguida, o programa deverá permitir que o usuário digite vários números inteiros `X`. 
Para cada número digitado, o programa deverá verificar se esse número existe no vetor `V`.
Caso o número seja encontrado, o programa deverá mostrar a posição em que ele aparece no vetor. 
Caso o número não seja encontrado, deverá exibir uma mensagem informando que ele não está presente.
A leitura dos números `X` deve continuar até que o usuário digite `0`, que encerrará o programa.
*/

package com.mycompany.exercicio_11_kleiton;

import java.util.Random;
import java.util.Scanner;

public class EXERCICIO_11_KLEITON {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Digite o valor:");
        int n = scanner.nextInt();

        if (n < 0 || n > 50) {
            System.out.println("O valor de N deve estar entre 0 e 50.");
            return;
        }

        int[] V = new int[n];

        for (int i = 0; i < n; i++) {
            V[i] = random.nextInt(100);
        }

        System.out.println("Vetor V:");
        for (int i = 0; i < n; i++) {
            System.out.print(V[i] + " ");
        }
        System.out.println();

        while (true) {
            System.out.print("Digite um numero X (ou 0 para sair): ");
            int x = scanner.nextInt();

            if (x == 0) {
                break;
            }

            boolean encontrado = false;
            for (int i = 0; i < n; i++) {
                if (V[i] == x) {
                    System.out.println("Numero " + x + " encontrado na posicao: " + i);
                    encontrado = true;
                }
            }

            if (!encontrado) {
                System.out.println("Numero " + x + " nao encontrado no vetor.");
            }
        }

        scanner.close();
    }
}
