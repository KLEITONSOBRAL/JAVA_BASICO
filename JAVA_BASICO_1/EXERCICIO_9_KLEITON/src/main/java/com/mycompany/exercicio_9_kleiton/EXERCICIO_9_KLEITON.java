package com.mycompany.exercicio_9_kleiton;

import java.util.ArrayList;
import java.util.Scanner;

public class EXERCICIO_9_KLEITON {
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

        ArrayList<Integer> valores = new ArrayList<>();
        int total = 0;
        int x;

        do {
            x = scanner.nextInt();
            if (x == 0) {
                break;
            }

            if (x >= min && x <= max) {
                valores.add(x);
                total += x;
            } else {
                System.out.println("Valor fora do intervalo [" + min + ", " + max + "] ignorado na totalizacao.");
            }
        } while (x != 0);

        System.out.println("Valores dentro do intervalo:");
        for (int valor : valores) {
            System.out.println(valor);
        }

        System.out.println("Total: " + total);
        System.out.println("Quantidade de valores no intervalo: " + valores.size());
        
        scanner.close();
    }
}
