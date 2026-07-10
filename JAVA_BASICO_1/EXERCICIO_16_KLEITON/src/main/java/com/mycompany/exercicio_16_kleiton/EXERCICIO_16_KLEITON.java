/*
Faça um programa em Java que leia a quantidade de funcionários de uma empresa.
Em seguida, leia o salário de cada funcionário e armazene esses valores em um vetor.
Depois, calcule a média salarial da empresa e informe quantos funcionários recebem
salário acima da média.
Ao final, exiba:
A media salarial e: MEDIA
Numero de funcionarios que ganham acima da media: QUANTIDADE
*/

package com.mycompany.exercicio_16_kleiton;

import java.util.Scanner;

public class EXERCICIO_16_KLEITON {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de funcionarios da empresa: ");
        int numFuncionarios = scanner.nextInt();

        double[] salarios = new double[numFuncionarios];
        double somaSalarios = 0;

        for (int i = 0; i < numFuncionarios; i++) {
            System.out.println("Digite o salario do funcionario " + (i + 1) + ": ");
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

        System.out.println("A média salarial é: " + mediaSalarial);
        System.out.println("Número de funcionarios que ganham acima da média: " + acimaDaMedia);

        scanner.close();
    }
}
