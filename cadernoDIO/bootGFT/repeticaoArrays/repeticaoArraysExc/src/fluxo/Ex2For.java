package fluxo;

import java.util.Scanner;

//Fatorial: Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
//        Ex.: 5!=5.4.3.2.1=120
public class Ex2For {
 public static void fatorial(){
  Scanner sc = new Scanner(System.in);
  int n;
  int fat;
  System.out.println("Qual numero devemos calcular o fatorial?");
  n = sc.nextInt();
  fat = n;
  for( int c = n; c >= 1 ; c--){
   fat *= c;
  }

  System.out.println(" O total é:"+fat);
 }
}
