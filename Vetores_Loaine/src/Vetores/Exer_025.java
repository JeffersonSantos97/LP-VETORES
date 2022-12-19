package Vetores;

import java.util.Scanner;

public class Exer_025 {

    public static void main( String[] args ) {

        Scanner sc = new Scanner( System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];


        // pegar os elementos do vetor A

        for(int i = 0 ; i < vetorA.length ; i++ ) {

            System.out.print("Entre com o " + ( i + 1 ) + " numero: ");
            vetorA[i] = sc.nextInt();

            // logica do vetor B

            if(vetorA[i] % 2 == 0 ) {

                vetorB[i] = 1;
            } else{

                vetorB[i] = 0;
            }
        }


        // printar o vetor A
        System.out.print("Vetor A = ");
        for( int i : vetorA) {

            System.out.print(i + " ");
        }

        System.out.println(); // pular uma linha
        System.out.print("Vetor B = ");
        for( int i : vetorB ) {

            System.out.print( i + " ");
        }







        sc.close();
    }



}
