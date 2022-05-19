package fluxo;

import java.util.Scanner;

//Maior e Média: Faça um programa que leia 5 números e informe o maior número e a média desses números.
public class Ex1DoWhile {
    public static void maiorMedia() {
        int maior = 0;
        int media = 0;
        int numero = 0;
        int c= 1;
        System.out.println("Informe 5 numeros e te diremos qual é a media entre eles e o maior de todos.");
        do  {
            Scanner sc = new Scanner(System.in);
            System.out.println("informe o "+c+"º numero:");
            numero = sc.nextInt();
            media+= numero;
            if ( numero > maior) maior= numero;
            c ++;

        }while (c < 6);
        System.out.println(" A media é "+ media/5);
        System.out.println(" E o maior numero foi: " +maior);
    }
}
