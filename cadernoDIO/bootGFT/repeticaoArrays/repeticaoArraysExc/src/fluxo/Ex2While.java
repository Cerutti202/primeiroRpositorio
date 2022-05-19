package fluxo;

import java.util.Scanner;

//fluxo.Nota: Faça um programa que peça uma nota, entre zero e dez.
// Mostre uma mensagem caso o valor seja inválido
// e continue pedindo até que o usuário informe um valor válido.
public class Ex2While {

    public static void nota() {
        int nota=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe uma nota de 0 a 10: ");
        nota= sc.nextInt();
        while (nota <0 || nota >10) {
            System.out.println("Voce inseriu um valor errado, por favor inserir um valor valido:");
            nota= sc.nextInt();
        }
        System.out.println(" A nota arquivada foi: " +nota);
        }
    }

