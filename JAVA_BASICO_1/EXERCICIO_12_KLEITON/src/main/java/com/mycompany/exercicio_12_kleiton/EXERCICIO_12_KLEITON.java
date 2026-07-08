/*
Faça um programa em Java que leia um valor inteiro `N`, representando a quantidade inicial de elementos de um vetor/lista.
O valor de `N` deve estar entre `0` e `50`. Caso o valor informado esteja fora desse intervalo, o programa deverá exibir uma mensagem de erro e encerrar.
Em seguida, o programa deverá criar uma lista chamada `V` e preenchê-la automaticamente com `N` números inteiros aleatórios entre `0` e `99`.
Depois, o programa deverá exibir todos os valores armazenados na lista `V`.
Em seguida, o programa deverá permitir que o usuário digite vários números inteiros `X`. Para cada número digitado,
o programa deverá remover da lista `V` todos os valores iguais a `X`.
Após cada remoção, o programa deverá exibir novamente a lista atualizada.
A leitura dos valores `X` deverá continuar até que o usuário digite `0`, que encerrará o programa.
*/

package com.mycompany.exercicio_12_kleiton;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class EXERCICIO_12_KLEITON {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Digite o valor:");
        int n = scanner.nextInt();
        
        if (n < 0 || n > 50) {
            System.out.println("O valor de N deve estar entre 0 e 50.");
            return;
        }
        
        ArrayList<Integer> V = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            V.add(random.nextInt(100));  
        }
        
        System.out.println("Vetor V:");
        for (int num : V) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        while (true) {
            System.out.print("Digite um numero X (ou 0 para sair): ");
            int x = scanner.nextInt();
            
            if (x == 0) {
                break;
            }
            
            V.removeIf(num -> num == x); 
            
            System.out.println("Vetor V apos remoção de " + x + ":");
            for (int num : V) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
