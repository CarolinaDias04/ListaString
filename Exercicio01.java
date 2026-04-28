package Pctex01;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String txt = "BoraBiu";
		System.out.println("O comprimento da string do txt é: " + txt.length());
		System.out.println(txt.toUpperCase());
		
		int numVogais = 0;
		String vogais = "aeiouAEIOU";
		
		for(int i = 0; i < txt.length(); i++) {
			if(vogais.indexOf(txt.charAt(i)) != -1) {
				
				numVogais++;
			}
		}
		System.out.println("Número de vogais:" +numVogais);
		

	}

}
