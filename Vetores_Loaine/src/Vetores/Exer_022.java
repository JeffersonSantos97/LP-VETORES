package Vetores;

import java.util.Scanner;

public class Exer_022 {

    public static void main(String[] args ) {

        Scanner sc = new Scanner( System.in);

        int[] vetorA = new int[10];
        int qtd0 = 0;
        int qtd1 = 0;

        for ( int i = 0 ; i < vetorA.length ; i++ ) {

            vetorA[i] = (int)Math.round(Math.random() * 1 );
            // colocamos um ( int ) pq no random retornam numeros double também como (0.4)

            // Math.round (ARREDONDA O NUMERO )
            //  * ex: Math.round(9.87) vai vira //9


            // Math.random() * 1

            // * esse gera um numero aleatório até o 1

            // multiplica o random pelo numero que vc quer que gere numeros até ali


            // saber a quantidade de 0 e 1

            if ( vetorA[i] == 0 ) {

                qtd0++;
            } else {

                qtd1++;
            }


        }
        // medir a porcentagem

        double porc0 = (qtd0 * 100 ) / 10;
        double porc1 = (qtd1 * 100 ) / 10;

        // printar os elementos do vetor A

        for ( int i : vetorA) {

            System.out.print( i + " ");
        }

        System.out.println(); // pular uma linha

        System.out.println("Porcemtagem do 1: " + porc1);
        System.out.println("Porcemtagem do 0: " + porc0);







        sc.close();
    }


}
