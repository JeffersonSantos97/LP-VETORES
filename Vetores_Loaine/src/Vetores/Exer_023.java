package Vetores;

import java.util.Scanner;

public class Exer_023 {

    public static void main(String[] args ) {

        Scanner sc = new Scanner( System.in);

        int[] vetorA = new int[10];

        // pegar o elementos do vetor

        for ( int i = 0 ; i < vetorA.length ; i++ ) {

            System.out.print("Entre com o " + ( i + 1 ) + " numero: "  );
            vetorA[i] = sc.nextInt();
//           Se for impar, vai sair do loop
            if(vetorA[i] % 2 != 0 ) {

                break; // o break vai fazer sair do loop e encerrar o programa
            }


        }












        sc.close();
    }

}
