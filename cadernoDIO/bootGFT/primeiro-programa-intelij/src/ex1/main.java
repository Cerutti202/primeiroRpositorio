package ex1;
// O exercicio solicita as seguintes tarefas:
// -> Calcular as 4 operaçãoes basicas: soma, subtração, multiplicação e
//divisão.
// -> A partir da hora do dia, informar  a saudação adequada.
// -> Calcular o valor final do emprestimo.
//
import static ex1.exA.*;
import static ex1.exB.*;
import static ex1.exC.*;
public class main {
    public static void main(String[] args) {
        soma(2,3);
        subtrai(5,3);
        multiplica(6,7);
        divide(5,6);
        saudacao(10.07);
        calculaJurosComp(1000,6,0.01);
    }
}
