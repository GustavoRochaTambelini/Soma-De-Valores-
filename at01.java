package atividades;

import java.util.Scanner;
// codigo para soma de dois numeros inteiros
public class at01 {
 static void soma(int a,int b){
	 int soma = a + b;
	 System.out.println("A Soma é: "+soma);
	 
 } 
	
static Scanner teclado = new Scanner(System.in);
 public static void main(String[]args){
	System.out.println("Insira um valor:");
	 int a = teclado.nextInt();
	 System.out.println("Insira outro valor para ser somado:");
	 int b = teclado.nextInt();
	soma(a,b);
	
}
}
