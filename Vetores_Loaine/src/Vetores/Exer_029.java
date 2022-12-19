package Vetores;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exer_029 {

    public static void main(String[] args) {

        Scanner sc = new Scanner ( System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length * 2];

        // pegar os elementos do vetorA
        for ( int i = 0 ; i < vetorA.length; i++ ) {

            System.out.print("Entre com o " + ( i + 1 ) + " numero do vetor A: ");
            vetorA[i] = sc.nextInt();

            vetorC[i] = vetorA[i];

            // vai até o 09 no vetor C
        }

        System.out.println(); // pular uma linha

        for ( int i = 0 ; i < vetorB.length; i++) {
            System.out.println("Entre com o " + ( i+ 1 ) + " numero do vetor B: ");
            vetorB[i] = sc.nextInt();

            vetorC[vetorA.length + i ] = vetorB[i]; // agora tem que começar da posição 10
            //            10 + 0 == 10
            //            10 + 1 == 11
            //            ...
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

            System.out.print(i + " ");
        }

        System.out.println(); // pular uma linha

        // printar o vetor C
        System.out.print("Vetor C = ");
        for ( int i : vetorC) {

            System.out.print(i + " ");
        }







        sc.close();
    }



}
