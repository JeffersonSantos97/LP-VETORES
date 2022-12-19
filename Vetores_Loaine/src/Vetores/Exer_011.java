package Vetores;

import java.util.Scanner;

public class Exer_011 {

    public static void main(String[] args ) {

        Scanner sc = new Scanner( System.in);

        int pares = 0; // variável par que faz a contagem dos numeros pares

        int[] vetorA = new int[10];

        // pegar os elementos do vetor A
        for(int i = 0 ; i < vetorA.length ; i++ ) {
            System.out.print("Entre com o " + ( i + 1 ) + " numero: ");
            vetorA[i] = sc.nextInt();
        }

        // percorrer o vetor A
        for(int i : vetorA ) {

            // Se o numero for par eu acrescento +1 na minha variável ( par )
            if(i % 2 == 0) {

            pares++;
            }
        }


        System.out.println("Pares = " + pares);









        sc.close();
    }

}
