package Vetores;

import java.util.Scanner;

public class Exer_031 {

    public static void main(String [] args ) {

        Scanner sc = new Scanner( System.in);


        int[] vetorA = new int[20];
        int[] vetorB = new int[vetorA.length];

        // pegar os elementos do vetor A

        for( int i = 0 ; i < vetorA.length ; i++ ) {

            System.out.print("Ente com o " + ( i + 1 ) + " numero: ");
            vetorA[i] = sc.nextInt();
        }

        // posição no vetor B

        int posB = 0; // posição do elemento dentro do vetor

        // colocar no vetorB todos os pares primeiro

        for ( int i : vetorA ) {

            if(i % 2 == 0 ) {

                vetorB[posB] = i;
                posB++;
            }
        }

        // colocar no vetor B todos os impares logo após os pares

        for( int i : vetorA) {

            if( i % 2 != 0 ) {

                vetorB[posB] = i;
                posB++;
            }
        }

        // printar o vetor A

        System.out.print("Vetor A = ");

        for ( int i : vetorA ) {

            System.out.print( i + " ");
        }

        System.out.println(); // pular uma linha


        // printar o vetor B
        System.out.print("Vetor B = ");
        for ( int i : vetorB ) {

            System.out.print( i + " ");
        }








        sc.close();
    }

}
