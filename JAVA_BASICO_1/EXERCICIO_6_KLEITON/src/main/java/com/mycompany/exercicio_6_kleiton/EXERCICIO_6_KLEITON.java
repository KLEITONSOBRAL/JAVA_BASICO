package com.mycompany.exercicio_6_kleiton;

import java.util.Scanner;

public class EXERCICIO_6_KLEITON {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;

        do {
            x = scanner.nextInt();
            if (x > 0) {
                System.out.println("Positivo");
            } else if (x < 0) {
                System.out.println("Negativo");
            }
        } while (x != 0);

        scanner.close();
    }
}

