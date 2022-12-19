package Vetores;

import java.util.Scanner;

public class Exer_030 {

    public static void main(String[] args) {

        Scanner sc = new Scanner ( System.in);

        int[] vetorA = new int[20];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];


        // pegar os elementos do vetor A

        for(int i = 0 ; i < vetorA.length; i++ ) {

            System.out.print("Entre com o " + (i + 1) + " numero: ");
            vetorA[i] = sc.nextInt();
        }

        // colocar exatamente só os pares ou impares de cada vetor

        int posB = 0; // posicao do indice do B vetor
        int posC = 0; // posicao do indice do C no vetor



        // logica do VetorB e C


        for ( int i = 0 ; i < vetorA.length ; i++ ) {

            if (vetorA[i] % 2 == 0) {

                vetorB[posB] = vetorA[i];
            } else {

                vetorC[posC] = vetorA[i];
            }
        }





            // printar o vetor A

        System.out.print("Vetor A = ");

        for( int i : vetorA) {

            System.out.print( i + " " );
        }

        System.out.println(); // pular uma linha

        // printar o vetor B

        System.out.print("Vetor B = ");

        for ( int i : vetorB) {

            System.out.print( i + " ");

        }
        System.out.println(); // pular uma linha
        // printar o vetor B

        for ( int i : vetorC) {

            System.out.print( i + " ");
        }










        sc.close();
    }


}
