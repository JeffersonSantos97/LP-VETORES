package Vetores;

import java.util.Scanner;

public class Exer_014 {

    public static void main(String[] args ) {

        Scanner sc = new Scanner( System.in);

        int soma = 0; // soma dos numeros impares
        int qtdImpares = 0; // quantidade de numeros impares
        double media;

        int[] vetorA = new int[10];

        // pegar os elementos

        for ( int i = 0 ; i < vetorA.length ; i++ ) {

            System.out.print("Entre como o " + ( i + 1 ) + " numero: ");
            vetorA[i] = sc.nextInt();
        }

    // somar os numeros impares

        for ( int i = 0 ; i < vetorA.length; i++ ) {

            if(vetorA[i] % 2 !=0 ) {

                soma += vetorA[i];

                qtdImpares++;

            }
        }

        media = soma / qtdImpares;


    // printar o vetor A

        System.out.print("Numero = " );

        for(int i : vetorA) {

            System.out.print( i + " ");
        }


        System.out.println(); // pular uma linha
    // printar a soma


        System.out.println("Soma dos impares = " + soma);
        System.out.println("Media = " + media);



        sc.close();
    }
}
