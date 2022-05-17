package ex1;

public class exC {
    public static void calculaJurosComp( double valorInicial, double tempoAplicação, double jurosM) {
        //M = C *(1 + j)^n
        double jincial = 1 + jurosM;
        double jfinal = Math.pow (jincial, tempoAplicação);
        double montante = valorInicial * jfinal ;
        System.out.println("O montande de  "+ valorInicial+ " a "+ jurosM+ " em  " +tempoAplicação+ "meses, " +"é"+ montante);
    }
}
