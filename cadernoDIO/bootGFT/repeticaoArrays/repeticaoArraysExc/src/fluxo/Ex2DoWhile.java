package fluxo;

import java.util.Scanner;

//Par e Ímpar: Faça um programa que peça N números inteiros.
//Calcule e mostre a quantidade de números pares e a quantidade de números impares.
public class Ex2DoWhile {
    public static void parImpar() {
        Scanner sc = new Scanner(System.in);
        int c= 0;
        int n;
        int imp=0;
        int par=0;
    System.out.println("Escrevam 12 numeros e te daremos quantos deles sao impar e quantos sao pares!");
        do {
            System.out.println(" Escreva o " + c + "º numero");
            n = sc.nextInt();
            if (n%2==0)  par ++;
            else imp++;
            c++;
        }while(c<13);
        }
    }

