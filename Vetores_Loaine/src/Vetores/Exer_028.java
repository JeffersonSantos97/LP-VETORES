package Vetores;

import java.util.Scanner;

public class Exer_028 {

    public static void main(String[] args) {


    Scanner sc = new Scanner ( System.in);


    int[] vetorA = new int[10];
    int[] vetorB = new int[vetorA.length];


    // pegar elementos do vetor A

        for ( int i = 0 ; i < vetorA.length ; i++ ) {

            System.out.print("Entre com o " + ( i + 1 ) + " numero: ");
            vetorA[i] = sc.nextInt();

            // logica do B

            vetorB[vetorA.length - i - 1] = vetorA[i];
            //      [ 10 - 0 - 1 ] == 9;
            //      [ 10 - 1 - 1 ] == 8;

            // o tamanho do vetor - o indice - 1 pq o vetor i começa com 0, então o ultimo elemento é no 9
            // então como o veotrB começa do final, ele tem que começar com 9


        }

        // printar o vetor A
        System.out.print("Vetor A = ");
        for ( int i : vetorA) {

            System.out.print( i + " ");
        }
        System.out.println(); // pular uma linha

        // printar o vetor B

        System.out.print("Vetor B = ");

        for ( int i : vetorB) {

            System.out.print( i + " ");
        }


    sc.close();
    }



}
