package com.mycompany.exercicio_11_kleiton;

import java.util.Random;
import java.util.Scanner;

public class EXERCICIO_11_KLEITON {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
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
