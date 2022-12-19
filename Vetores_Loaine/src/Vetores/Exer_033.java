package Vetores;

import java.util.Scanner;

public class Exer_033 {

    public static void main(String [ ] args ) {

        Scanner sc = new Scanner ( System.in);

        int[] vetorA = new int[10];

        // pegar os elementos do vetor A
        for ( int i = 0 ; i < vetorA.length ; i++ ) {

            System.out.print("Entre com o " + ( i + 1 ) + " numero: ");
            vetorA[i] = sc.nextInt();
        }

        for( int i : vetorA ) {

            if( i % 2 != 0 ) {

                System.out.println( i + " - PRIMO");
            } else {

                System.out.println(i + " - NÃO PRIMO");
            }
        }





        sc.close();
    }




}
