package ex1;

// O exercicio solicita as seguintes tarefas:
// -> Calcular as 4 operaçãoes basicas: soma, subtração, multiplicação e
//divisão.
// -> A partir da hora do dia, informar  a saudação adequada.
// -> Calcular o valor final do emprestimo.
//
public class exA {
    static void subtrai(double n1, double n2) {
        double result = n1 - n2;
        System.out.println("Subtraindo "+ n1+ " de "+ n2+ " o resultado é " +result);
}
    public static void soma(double n1, double n2) {
        double result = n1+n2;
        System.out.println( "Somando " +n1 +" a " +n2+ " o resultado é" +result );
}
    public static void multiplica(double n1, double n2) {
        double result = n1*n2;
        System.out.println("Multiplicando " +n1 +" a " +n2+ " o resultado é" +result);
    }
   public static void divide(double n1, double n2) {
        double result=n1/n2;
        System.out.println("Dividindo " +n1 +" a " +n2+ " o resultado é" +result);
    }




}
