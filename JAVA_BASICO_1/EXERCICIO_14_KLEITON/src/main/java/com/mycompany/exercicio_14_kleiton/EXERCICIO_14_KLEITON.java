package com.mycompany.exercicio_14_kleiton;

import java.util.Scanner;

public class EXERCICIO_14_KLEITON {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double somaSalariosAtuais = 0;
        double somaSalariosReajustados = 0;
        
        while (true) {
            System.out.print("Digite o nome do funcionario (ou FIM para encerrar): ");
            String nome = scanner.nextLine();
            
            if (nome.equalsIgnoreCase("FIM")) {
                break;
            }
            
            System.out.print("Digite o salario atual do funcionario: ");
            double salarioAtual = scanner.nextDouble();
            scanner.nextLine();  // Consumir o newline restante
            
            double salarioReajustado;
            
            if (salarioAtual <= 150) {
                salarioReajustado = salarioAtual * 1.25;
            } else if (salarioAtual <= 300) {
                salarioReajustado = salarioAtual * 1.20;
            } else if (salarioAtual <= 600) {
                salarioReajustado = salarioAtual * 1.15;
            } else {
                salarioReajustado = salarioAtual * 1.10;
            }
            
            System.out.println("Nome: " + nome);
            System.out.println("Salario Atual: " + salarioAtual);
            System.out.println("Salario Reajustado: " + salarioReajustado);
            
            somaSalariosAtuais += salarioAtual;
            somaSalariosReajustados += salarioReajustado;
        }
        
        double diferenca = somaSalariosReajustados - somaSalariosAtuais;
        
        System.out.println("Soma dos salarios atuais: " + somaSalariosAtuais);
        System.out.println("Soma dos salarios reajustados: " + somaSalariosReajustados);
        System.out.println("Diferenca: " + diferenca);
        
        scanner.close();
    }
}
