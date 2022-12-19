package Vetores;

import java.util.Scanner;

public class Exer_006 {

        public static void main(String[] args) {

            Scanner sc = new Scanner( System.in);

            int[] vetorA = new int[10];
            int[] vetorB = new int[vetorA.length];
            int[] vetorC = new int[vetorA.length];

            // pegar os elementos do vetorA

            for(int i = 0 ; i < vetorA.length; i++ ) {

                System.out.print("Entre com o " + (i + 1)  + " numero do vetor A: ");
                vetorA[i] = sc.nextInt();
            }

            System.out.println(); // pular uma linha


            // pepar elementos do vetorB

            for ( int i = 0 ; i < vetorB.length; i++ ) {
                System.out.print("Entre com o "  + (i + 1 ) +  "numero do Vetor B: ");

                vetorB[i] = sc.nextInt();


            }

            // logica para o vetor C


            for(int i = 0 ; i < vetorA.length; i++ ) {

                vetorC[i] = vetorA[i] + vetorB[i];
            }

            // printar o vetorA

            System.out.print("Vetor A =  ");

            for(int i : vetorA) {

                System.out.print( i + " ");

            }

            System.out.println(); // pular uma linha

            // printar o vetor B

            System.out.print("Vetor B =  ");

            for(int i : vetorB ) {

                System.out.print( i + " ");
            }

            System.out.println(); // pular uma linha

            // printar o vetor C

            System.out.print("Vetor C = ");

            for( int i : vetorC ) {

                System.out.print( i + " ");
            }







            sc.close();
        }

}
