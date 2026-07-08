/*
Faça um programa em Java que leia dois valores inteiros representando o limite mínimo e o limite máximo de um intervalo.
Caso o valor mínimo informado seja maior que o valor máximo, o programa deverá inverter os valores e exibir uma mensagem informando a troca.
Em seguida, o programa deverá ler vários números inteiros até que o valor `0` seja digitado. Para cada número lido,
verifique se ele está dentro do intervalo definido, incluindo os limites mínimo e máximo.
Os valores que estiverem dentro do intervalo deverão ser armazenados em uma lista e somados. Os valores fora do intervalo deverão ser ignorados,
exibindo uma mensagem informando que foram desconsiderados.
Ao final, o programa deverá mostrar:
* todos os valores digitados que estavam dentro do intervalo;
* o total da soma desses valores;
* a quantidade de valores válidos dentro do intervalo.
*/

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
