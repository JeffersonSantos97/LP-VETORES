package Vetores;

import java.util.Scanner;

public class Exer_010 {
    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        // pegar os elemtos do Vetor A

        for ( int i = 0 ; i < vetorA.length ; i++ ) {

            System.out.print("Entre com o " + ( i + 1 ) + " numero do Vetor A: ");
            vetorA[i] = sc.nextInt();
        }

        // logica do Vetor

        for( int i = 0 ; i < vetorA.length; i ++ ) {

            vetorB[i] = vetorA[i] % 2;
        }
        System.out.println(); // pular uma linha
        // Printar o vetor A

        System.out.print("Vetor A = ");

        for ( int i : vetorA) {

            System.out.print( i + " ");
        }
        System.out.println(); // pular uma linha
        // printar o vetor B

        System.out.print("Vetor B = ");

        for( int i : vetorB) {

            System.out.print( i + " ");
        }






        sc.close();
    }
}
