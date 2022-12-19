package Vetores;
import java.util.Scanner;
public class Exer_024 {

    public static void main(String[] args ) {

        Scanner sc = new Scanner ( System.in);

        int[] vetorA = new int[10];

        // pegar os elementos

        for ( int i = 0 ; i < vetorA.length ; i++ ) {

            System.out.print("Entre com o " + (i + 1) + " numero: " );
            vetorA[i] = sc.nextInt();


        }
        System.out.print("Vetor A = ");
        for(int i : vetorA) {

            System.out.print(i + " ");
        }
        System.out.println(); // pular uma linha

        if(vetorA[0] == vetorA[9] && vetorA[1] == vetorA[8] && vetorA[2] == vetorA[7] && vetorA[3] == vetorA[6]

           && vetorA[4] == vetorA[5] ) {

            System.out.println("É um Palindromo ");
        } else {

            System.out.println("NAO E um Palindromo ");
        }









        sc.close();
    }



}
