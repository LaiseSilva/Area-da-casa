package areaDaCasa;

import java.util.Scanner;

public class AreaDaCasa {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		String comodo, resposta;
		double largura, comprimento, area, areaTotal;

		System.out.println("---------------------------------");
		System.out.println(" C�lculo da �rea de uma casa ");
		System.out.println("---------------------------------");
		System.out.println("");

		System.out.print("Qual o nome do c�modo? ");
		comodo = leitor.next();

		System.out.print("Qual a largura? ");
		largura = leitor.nextDouble();

		System.out.print("Qual o comprimento? ");
		comprimento = leitor.nextDouble();

		areaTotal = comprimento * largura;
		System.out.println("Sua/seu " + comodo + " tem " + areaTotal + " metros quadrados");
		System.out.println();

		System.out.println("Deseja adicionar mais c�modos?");
		System.out.println("Aperte S (para sim) e N (para n�o)");
		resposta = leitor.next();
		System.out.println();

		while (resposta.equals("S") | resposta.equals("s")) {

			System.out.print("Qual o nome do c�modo? ");
			comodo = leitor.next();

			System.out.print("Qual a largura? ");
			largura = leitor.nextDouble();

			System.out.print("Qual o comprimento? ");
			comprimento = leitor.nextDouble();
			area = comprimento * largura;

			System.out.println("Sua/seu " + comodo + " tem " + area + " metros quadrados");
			areaTotal = area + areaTotal;

			System.out.println("Deseja adicionar mais c�modos?");
			System.out.println("Aperte S (para sim) e N (para n�o)");
			resposta = leitor.next();
		}

		leitor.close();
		System.out.println("---------------------------------------");
		System.out.println("A �rea total da sua casa � " + areaTotal);
		System.out.println("---------------------------------------");

	}

}
