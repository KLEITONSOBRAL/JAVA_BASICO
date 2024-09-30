package com.mycompany.exercicio_12_kleiton;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class EXERCICIO_12_KLEITON {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
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
