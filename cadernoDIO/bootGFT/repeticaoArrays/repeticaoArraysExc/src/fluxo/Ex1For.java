package fluxo;
//Tabuada: Desenvolva um gerador de tabuada,
//capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
//O usuário deve informar de qual numero ele deseja ver a tabuada.
//A saída deve ser conforme o exemplo abaixo:
//        Tabuada de 5:
//        5 X 1 = 5
//        5 X 2 = 10
//        ...
//        5 X 10 = 50

import java.util.Scanner;

public class Ex1For {

public static void tabuada(){
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("De qual numero você quer a tabuada?");
    n= sc.nextInt();
    for (int i = 0; i < 11; i++){
        System.out.println(n+" X "+i+" = " +n*i);
    }
}

}