package com.mycompany.exercicio_5_kleiton;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class EXERCICIO_5_KLEITON {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String nome = scanner.nextLine();
        double peso = scanner.nextDouble();
        String categoria;

        if (peso < 65) {
            categoria = "Pena";
        } else if (peso >= 65 && peso < 72) {
            categoria = "Leve";
        } else if (peso >= 72 && peso < 79) {
            categoria = "Ligeiro";
        } else if (peso >= 79 && peso < 86) {
            categoria = "Meio medio";
        } else if (peso >= 86 && peso < 93) {
            categoria = "Medio";
        } else if (peso >= 93 && peso < 100) {
            categoria = "Meio pesado";
        } else {
            categoria = "Pesado";
        }
        
        try {
            FileWriter arquivo = new FileWriter("lutador.txt");
            PrintWriter gravarArquivo = new PrintWriter(arquivo);
            gravarArquivo.println("Nome fornecido: " + nome);
            gravarArquivo.println("Peso fornecido: " + peso);
            gravarArquivo.println("O lutador " + nome + " pesa " + peso + " kg e se enquadra na categoria " + categoria);
            gravarArquivo.close();
        } catch (Exception e) {
            System.out.println("Erro ao gravar o arquivo.");
        }
        
        scanner.close();
    }
}
