package fluxo;//Nome e Idade: Faça um programa que leia conjuntos de dois valores,
// o primeiro representando o nome do aluno e o segundo representando a sua idade.
// (Pare o programa inserindo o valor 0 no campo nome)

//fluxo.Nota: Faça um programa que peça uma nota, entre zero e dez.
// Mostre uma mensagem caso o valor seja inválido
// e continue pedindo até que o usuário informe um valor válido.
import java.util.Scanner;

public class Ex1While {

    public static void nomeIdade() {

        int idade;
        String nome = null;
        while (! "0".equals(nome)) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Escreva ai pra mim um nome: ");
            nome= sc.nextLine();
            if(nome.equals("0")){
                break;
            }
             System.out.println("Escreva ai agora uma idade pra mim: ");
             idade= sc.nextInt();
             System.out.println("O nome colocado foi "+nome);

             System.out.println("A idade colocada foi "+idade);
        }

    }
}
