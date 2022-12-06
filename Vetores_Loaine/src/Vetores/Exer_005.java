package Vetores;

import java.util.Scanner;

public class Exer_005 {

    public static void main( String[] args ) {

        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        // pegar elementos do vetorA

        for(int i = 0 ; i < vetorA.length; i++ ) {
            System.out.print("Entre com o " + ( i + 1 ) + " elemento do vetor A: " );
            vetorA[i] = sc.nextInt();
        }

        // lógica pra colocar os elementos do vetorB

        for( int i = 0; i < vetorB.length ; i++ ) {

            vetorB[i] = vetorA[i] * i;
        }

        // printar na tela o vetorA

        System.out.print("Vetor A = ");
        for( int i = 0 ; i < vetorA.length ; i++ ) {

            System.out.print(vetorA[i] + " ");

        }

        System.out.println(); // pular uma linha

        // printar o vetorB

        System.out.print("Vetor B = ");

        for( int i = 0 ; i < vetorB.length ; i++ ) {

            System.out.print(vetorB[i] + " ");
        }

sc.close();
    }
}
