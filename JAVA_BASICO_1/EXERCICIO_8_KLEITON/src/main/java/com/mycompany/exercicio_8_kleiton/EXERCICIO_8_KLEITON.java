/*
Faça um programa em Java que leia dois valores inteiros representando o limite mínimo e o limite máximo de um intervalo.
Caso o valor mínimo informado seja maior que o valor máximo, o programa deverá inverter os valores e informar ao usuário que a inversão foi realizada.
Em seguida, o programa deverá ler vários números inteiros até que o valor `0` seja digitado. Para cada número lido,
verifique se ele está dentro do intervalo definido, incluindo os limites mínimo e máximo.
Os valores que estiverem dentro do intervalo devem ser somados e contabilizados. Os valores fora do intervalo devem ser ignorados na totalização,
exibindo uma mensagem informando que foram desconsiderados.
Ao final, o programa deverá mostrar:
* o total da soma dos valores dentro do intervalo;
* a quantidade de valores válidos digitados dentro do intervalo.
*/

package com.mycompany.exercicio_8_kleiton;

import java.util.Scanner;

public class EXERCICIO_8_KLEITON {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int valor1 = 0, valor2 = 0, temp = 0, total = 0, quantidade = 0, x = 0;

        System.out.println("Digite o primeiro valor:");
        valor1 = scanner.nextInt();

        System.out.println("Digite o segundo valor:");
        valor2 = scanner.nextInt();

        if (valor1 > valor2) {
            temp = valor1;
            valor1 = valor2;
            valor2 = temp;
            System.out.println("Valores invertidos: Minimo agora é " + valor1 + " e o Máximo agora é " + valor2);
        }

        do {
            x = scanner.nextInt();
            if (x == 0) {
                break;
            }

            if (x >= valor1 && x <= valor2) {
                total += x;
                quantidade++;
            } else {
                System.out.println("Valor fora do intervalo [" + valor1 + ", " + valor2 + "] ignorado na totalização.");
            }
        } while (x != 0);

        System.out.println("Total: " + total);
        System.out.println("Quantidade de valores no intervalo: " + quantidade);

        scanner.close();
    }
}
