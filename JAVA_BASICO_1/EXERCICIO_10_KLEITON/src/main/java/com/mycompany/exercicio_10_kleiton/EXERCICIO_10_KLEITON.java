package com.mycompany.exercicio_10_kleiton;

import java.util.ArrayList;
import java.util.Scanner;

public class EXERCICIO_10_KLEITON {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        if (n < 0 || n > 50) {
            System.out.println("O valor de N deve estar entre 0 e 50.");
            return;
        }
        
        double[] A = new double[n];
        ArrayList<Double> NEG = new ArrayList<>();
        ArrayList<Double> POS = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
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
