package Vetores;

import java.util.Scanner;

public class Exer_026 {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];


        // pegar os elementos do vetor A

        for ( int i = 0 ; i < vetorA.length ; i++ ) {

            System.out.print("Entre com o " + (i + 1 ) + " numero: " );
            vetorA[i] = sc.nextInt();
        }

        // pegar os elementos do vetor B

        for ( int i = 0 ; i < vetorB.length ; i++ ) {

            System.out.print("Entre com o " + ( i + 1 ) + " numero: ");
            vetorB[i] = sc.nextInt();

            // logica do Vetor C

            if(vetorA[i] > vetorB[i] ) {

                vetorC[i] = 1;
            } else if(vetorA[i] == vetorB[i] ) {

                vetorC[i] = 0;
            } else {

                vetorC[i] = -1;
            }
        }

        // printar o vetorA
        System.out.print("Vetor A = ");
        for ( int i : vetorA ) {

            System.out.print( i + " ");
        }

        System.out.println(); // pular uma linha

        // printar o vetor B

        System.out.print("Vetor B = ");
        for ( int i : vetorB) {

            System.out.print( i + " ");
        }

        System.out.println(); // pular uma linha

        // printar o vetor C

        System.out.print("Vetor C = ");

        for ( int i : vetorC ) {

            System.out.print( i + " ");
        }




        sc.close();
    }


}
