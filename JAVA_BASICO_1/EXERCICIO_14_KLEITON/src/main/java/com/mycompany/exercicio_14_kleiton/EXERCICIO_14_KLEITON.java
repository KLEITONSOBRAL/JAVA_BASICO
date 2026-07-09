/*
Faça um programa em Java que leia o nome e o salário atual de vários funcionários.
A leitura deve continuar até que seja digitado `FIM` no lugar do nome do funcionário.
Para cada funcionário, o programa deve calcular o salário reajustado de acordo com a seguinte tabela:
Salário até 150: aumento de 25%
Salário acima de 150 até 300: aumento de 20%
Salário acima de 300 até 600: aumento de 15%
Salário acima de 600: aumento de 10%
Para cada funcionário, o programa deve exibir:
Nome do funcionário
Salário atual
Salário reajustado
Ao final, o programa deve exibir:
Soma dos salários atuais
Soma dos salários reajustados
Diferença entre a soma dos salários reajustados e a soma dos salários atuais
*/

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
