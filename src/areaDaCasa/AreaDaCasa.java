package areaDaCasa;

import java.util.Scanner;

public class AreaDaCasa {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		String comodo,resposta;
		double largura,comprimento,area,totalArea;
		
		System.out.println("---------------------------------");
		System.out.println(" Cálculo da área de uma casa ");
		System.out.println("---------------------------------");
		System.out.println("");
		
		System.out.print("Qual o nome do cômodo? ");
		comodo = leitor.next();
		
		System.out.print("Qual a largura? ");
		largura = leitor.nextDouble();
		
		System.out.print("Qual o comprimento? ");
		comprimento = leitor.nextDouble(); 
		
		area = largura * comprimento;
		System.out.println("O " + comodo + " tem " + area + " metros quadrados");
		
		
	

	}

}
