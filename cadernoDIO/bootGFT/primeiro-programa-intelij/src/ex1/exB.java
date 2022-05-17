package ex1;

public class exB {


    static void saudacao(double horasAtual) {
        if(horasAtual > 0 && horasAtual <=6 ){
            System.out.println("Boa Madrugada!");
        }else if (horasAtual >6 && horasAtual <= 12){
            System.out.println("Bom dia!");
        } else if (horasAtual > 12 && horasAtual<=18){
            System.out.println("Boa tarde!");
        } else if (horasAtual >18 && horasAtual<= 24){
            System.out.println("Boa noite!");
        }
    }
}
