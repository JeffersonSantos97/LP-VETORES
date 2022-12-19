package Vetores;

import java.util.Scanner;

public class Exer_017 {

    public static void main(String[] args ) {

        Scanner sc = new Scanner (System.in);

            int[] idades = new int[10];
            String[] nomes = new String[idades.length];

            // pegar as idades e o nomes para amazenar no vetor
        for ( int i = 0 ; i < idades.length ; i++ ) {

            // Nós não usamos os nomes armazenados, mas serve como exercício pra deixar os nomes armazenados pra quando precisar
            System.out.print("Qual seu nome: ");
            nomes[i] = sc.nextLine();

            System.out.print("Entre com a sua idade " + nomes[i]);
            idades[i] = sc.nextInt();

            sc.nextLine(); // Pular uma linha por conta do int e nextLine
        }

        // idade superior a 35
        int maior35 = 0;
        for ( int i : idades) {

            if( i > 35 ) {

                maior35++;
            }
        }

        // printar as idades
        System.out.print("Idades = ");
        for ( int i : idades ) {

            System.out.print(i + " ");
        }

        System.out.println(); // pular uma linha

        // quantidade de idade maior que 35

        System.out.println("Quantidade maior que 35: " + maior35);






        sc.close();

    }


}
