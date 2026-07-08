/*Faça um programa em Java que leia o nome e o peso de um lutador.
Com base no peso informado, o programa deve classificar o lutador em uma das seguintes categorias:
Pena — abaixo de 65 kg
Leve — de 65 kg até abaixo de 72 kg
Ligeiro — de 72 kg até abaixo de 79 kg
Meio medio — de 79 kg até abaixo de 86 kg
Medio — de 86 kg até abaixo de 93 kg
Meio pesado — de 93 kg até abaixo de 100 kg
Pesado — 100 kg ou mais
Após definir a categoria, o programa deve gravar em um arquivo chamado `lutador.txt` as seguintes informações:
Nome fornecido: NOME
Peso fornecido: PESO
O lutador NOME pesa PESO kg e se enquadra na categoria CATEGORIA
*/

package com.mycompany.exercicio_5_kleiton;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class EXERCICIO_5_KLEITON {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String nome = "";
        String categoria;
        double peso = 0;

        System.out.println("Digite seu nome: ");
        nome = scanner.nextLine();

        System.out.println("Digite seu peso: ");
        peso = scanner.nextDouble();

        if (peso < 65) {
            categoria = "Pena";
        } else if (peso >= 65 && peso < 72) {
            categoria = "Leve";
        } else if (peso >= 72 && peso < 79) {
            categoria = "Ligeiro";
        } else if (peso >= 79 && peso < 86) {
            categoria = "Meio médio";
        } else if (peso >= 86 && peso < 93) {
            categoria = "Médio";
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
            gravarArquivo.println("O lutador " + nome + " pesa " + peso + "kg e se enquadra na categoria " + categoria);
            gravarArquivo.close();
        } catch (Exception e) {
            System.out.println("Erro ao gravar o arquivo.");
        }

        scanner.close();
    }
}
