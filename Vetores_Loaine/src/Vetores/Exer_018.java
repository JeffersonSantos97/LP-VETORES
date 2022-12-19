package Vetores;
import java.util.Scanner;
public class Exer_018 {

    public static void main(String[] args ) {

        Scanner sc = new Scanner ( System.in);

        int[] idades = new int[10];

        for( int i = 0 ; i < idades.length; i++ ) {

            System.out.println("Entre com o " + ( i + 1 ) + " numero: ");
            idades[i] = sc.nextInt();

        }
        int maior = idades[0];
        int menor = idades[0];
        int indexMaior = 0;
        int indexMenor = 0;
        for( int i = 1 ; i < idades.length; i++ ) {

            if(  idades[i] > maior ) {

                maior = idades[i];

                indexMenor = i + 1 ;

            }

            else if(idades[i] < menor ) {

                menor = idades[i];
                indexMaior = i + 1 ;
            }
        }

        // printar numeros
        System.out.print("Numeros = ");
        for ( int i : idades) {

            System.out.print( i + " ");
        }

        System.out.println(); // pular uma linha

        System.out.println("Maior: "  + maior );
        System.out.println("Posicao do Maior: " + indexMenor);

        System.out.println("Menor: " + menor);
        System.out.println("Posicao do Menor: " + indexMaior);



        sc.close();
    }


}
