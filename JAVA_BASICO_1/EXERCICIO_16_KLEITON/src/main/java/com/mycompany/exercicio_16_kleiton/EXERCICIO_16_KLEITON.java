package com.mycompany.exercicio_16_kleiton;

import java.util.Scanner;

public class EXERCICIO_16_KLEITON {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o numero de funcionarios da empresa: ");
        int numFuncionarios = scanner.nextInt();
        
        double[] salarios = new double[numFuncionarios];
        double somaSalarios = 0;
        
        for (int i = 0; i < numFuncionarios; i++) {
            System.out.print("Digite o salario do funcionario " + (i + 1) + ": ");
            salarios[i] = scanner.nextDouble();
            somaSalarios += salarios[i];
        }
        
        double mediaSalarial = somaSalarios / numFuncionarios;
        int acimaDaMedia = 0;
        
        for (int i = 0; i < numFuncionarios; i++) {
            if (salarios[i] > mediaSalarial) {
                acimaDaMedia++;
            }
        }
        
        System.out.println("A media salarial e: " + mediaSalarial);
        System.out.println("Numero de funcionarios que ganham acima da media: " + acimaDaMedia);
        
        scanner.close();
    }
}
