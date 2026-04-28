package Pctex02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner receba = new Scanner(System.in);
		
		System.out.print("Digite uma string: ");
		String str = receba.nextLine();
		String invertida = new StringBuilder(str).reverse().toString();
		if (str.equals(invertida)) { System.out.println("é palindromo");
		} else {System.out.println("Não é palindromo"); } receba.close(); }
		
		
		
		


	}


