package com.mycompany.exercicio_8_kleiton;

import java.util.Scanner;

public class EXERCICIO_8_KLEITON {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int min = scanner.nextInt();
        int max = scanner.nextInt();
        
        if (min > max) {
            int temp = min;
            min = max;
            max = temp;
            System.out.println("Valores invertidos: Min agora e " + min + " e Max e " + max);
        }

        int total = 0;
        int quantidade = 0;
        int x;

        do {
            x = scanner.nextInt();
            if (x == 0) {
                break;
            }

            if (x >= min && x <= max) {
                total += x;
                quantidade++;
            } else {
                System.out.println("Valor fora do intervalo [" + min + ", " + max + "] ignorado na totalizacao.");
            }
        } while (x != 0);

        System.out.println("Total: " + total);
        System.out.println("Quantidade de valores no intervalo: " + quantidade);
        
        scanner.close();
    }
}
