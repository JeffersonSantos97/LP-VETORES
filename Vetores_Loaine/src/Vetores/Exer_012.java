package Vetores;

import java.util.Scanner;

public class Exer_012 {

    public static void main( String[] args ) {

        Scanner sc = new Scanner( System.in);

        int soma = 0; // variável somo. Onde vai ser somado cada elemento do vetor
        
        int[] vetorA = new int[10];

        // pegar elementos do Vetor

        for ( int i = 0 ; i < vetorA.length; i++ ) {

            System.out.print("Entre como o " + ( i + 1 ) + " numero: ");
            vetorA[i] = sc.nextInt();


        }

        for ( int i  : vetorA) {

            soma += i;
        }

        System.out.println("SOMA = " + soma);




        sc.close();
    }

}
