package Vetores;

import java.util.Scanner;

public class Exer_009 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        float[] vetorC = new float[vetorA.length];

        // pegar os elementos do Vetor A

        for ( int i = 0; i < vetorA.length ; i++ ) {

            System.out.print("Entre com o " + ( 1 + i ) + " numero do vetor A: ");
            vetorA[i] = sc.nextInt();
        }
        System.out.println(); // pular uma linha

        // pegar os elementos do vetor B

        for( int i = 0 ; i < vetorB.length ; i++ ) {

            System.out.print("Entre com o " + ( 1 + 1) + " numero do vetor B: ");
            vetorB[i] = sc.nextInt();
        }

        // logica do vetor C

        for( int i = 0 ; i < vetorA.length ; i++ ) {

            vetorC[i] = vetorA[i] /  vetorB[i];
        }

        // printar o vetor A

        System.out.print("Vetor A = ");

        for ( int i : vetorA) {

            System.out.print( i + " ");
        }

        System.out.println(); // pular uma linha

        // printar o Vetor B

        System.out.print("Vetor B = ");

        for ( int i : vetorB ) {

            System.out.print( i + " " );
        }

        System.out.println(); // pular uma linha

        // printar o vetor C

        System.out.print("Vetor C = ");

        for(float i : vetorC) {

            System.out.print( i + " ");
        }






        sc.close();
    }
}
