package Vetores;
import java.util.Scanner;
public class Exer_032 {

    public static void main( String [] args ) {

        Scanner sc = new Scanner ( System.in);

        int[] vetorA = new int[5];

        // pegar os elementos do vetor A

        for ( int i = 0 ; i < vetorA.length; i++ ) {

            System.out.print(" Entre com o " + ( i+ 1 ) + " numero: ");
            vetorA[i] = sc.nextInt();
        }



             // loop que pega cada elemento do vetorA
       for( int i = 0 ; i < vetorA.length ; i++ ) {


           System.out.println("Tabuada de " + vetorA[i]);

           // loop que faz o calculo da tabuada
           for( int j = 1 ; j <= 10 ; j++ ) {

               System.out.println( vetorA[i] + " x " + j + " = " + (vetorA[i] * j ));
           }

           System.out.println(); // pular uma linha


       }








        sc.close();
    }




}
