package Vetores;

import java.util.Scanner;

public class Exer_007 {

    public static void main(String[] args ) {

        Scanner sc = new Scanner(System.in);


        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];

        // pegar os elemetos do Vetor A

        for ( int i = 0 ; i < vetorA.length ; i++ ) {
            System.out.print("Entre com o numero " + ( i + 1 ) + " do vetor A: ");
            vetorA[i] = sc.nextInt();

        }
            // Pegar os elementos do Vetor B

        for ( int i = 0 ; i < vetorA.length ; i++ ) {
            System.out.print("Entre com o numero " + ( i + 1 ) + " do vetor B: ");
            vetorB[i] = sc.nextInt();

        }

        // Lógica do Vetor C

        for ( int i = 0 ; i < vetorA.length ; i++ ) {

            vetorC[i] = vetorA[i] - vetorB[i];

        }

        // printar o vetor A

        System.out.print("Vetor A = ");
        for ( int i : vetorA ) {

            System.out.print( i + " ");
        }

        System.out.println(); // pular uma linha

        // printar o vetor B

        System.out.print("Vetor B = ");

        for ( int i : vetorB) {

            System.out.print(i + " ");
        }

        System.out.println(); // pular uma linha

        // printar o vetor C

        System.out.print("Vetor C = ");

        for( int i : vetorC ) {

            System.out.print(i + " ") ;
        }


        sc.close();
    }

}
