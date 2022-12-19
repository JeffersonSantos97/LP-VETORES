package Vetores;

import java.util.Scanner;

public class Exer_016 {

    public static void main(String[] args ) {

        Scanner sc = new Scanner( System.in);

        // criar um vetor com 10 elementos inteiros

        int[] vetorA = new int[10];

        // pegar os elementos

        for ( int i = 0 ; i < vetorA.length ; i++ ) {

            System.out.print("Entre com o " + ( i + 1 ) + " numero:");
            vetorA[i] = sc.nextInt();
        }

        // inferiores a 15
        int somaInferior15 = 0;
        int iguais15 = 0;
        int maior15 = 0;
        int qtdMaior = 0;

        // loop pra pegar os elementos e fazer a lógica
        for(int i : vetorA) {
            // soma dos inferiores a 15
            if( i < 15 ) {

            somaInferior15 += i;
            }
            // quantidade de elementos iguais a 15
            else if(i == 15 ) {

                iguais15++;
            }
        // maiores que 15

            else {

              maior15 += i;

              qtdMaior++;
            }
        }
    //    media dos Maiores de 15
        double mediaMaiores15 = maior15 / qtdMaior;


        // printar o vetor A na tela

        System.out.print("Vetor A ");

        for ( int i : vetorA) {

            System.out.print( i + " ");
        }

        System.out.println(); // pular uma linha

        // Soma dos inferiores  a 15

        System.out.println("Soma superiores a 15 = " + somaInferior15);

        // Quantidade de elementos que são iguais a 15

        System.out.println(" Iguais a 15 = " + iguais15);

        // Média dos elementos superiores a 15

        System.out.println("Media Superiores a 15 = " + mediaMaiores15);






        sc.close();
    }
}
