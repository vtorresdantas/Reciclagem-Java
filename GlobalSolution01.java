import java.text.DecimalFormat;
import java.util.Scanner;

public class GS {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		DecimalFormat fM = new DecimalFormat("R$ ###0.00");

		// Variaveis
		int codProduto = 0, quantidade = 0, lacre0 = 0, lacre1 = 0, cont = 0, garrafaVidro = 0, garrafaPet = 0;
		int plastico = 0, aluminio = 0, vidro = 0, comprimento = 0, largura = 0;
		double ternoPitagorico = 0;
		double credito = 0, totalCredito = 0, peso = 0, litro = 0;

		while (codProduto != 5) {

			cont++;

			// total de creditos
			totalCredito = totalCredito + credito;

			System.out.println("");
			System.out.println("---------------------------------------------------------");
			System.out.println(cont + "º Deposito de material.");

			// Entradas de itens
			System.out.println("Escolha um dos materias:");
			System.out.println("1 – PAPEL (CAIXAS DE PAPELÃO)");
			System.out.println("2 – VIDRO (GARRAFAS DE VINHO)");
			System.out.println("3 – ALUMÍNIO (LATAS DE REFRIGERANTE E CERVEJA)");
			System.out.println("4 – PLÁSTICO");
			System.out.println("5 – Sair");
			System.out.println("---------------------------------------------------------");
			codProduto = entrada.nextInt();

			// Validação entrada de itens

			while (codProduto > 5) {
				System.out.println("Escolha um material válido:");
				System.out.println("1 – PAPEL (CAIXAS DE PAPELÃO)");
				System.out.println("2 – VIDRO (GARRAFAS DE VINHO)");
				System.out.println("3 – ALUMÍNIO (LATAS DE REFRIGERANTE E CERVEJA)");
				System.out.println("4 – PLÁSTICO");
				System.out.println("5 – Sair");
				System.out.println("---------------------------------------------------------");
				codProduto = entrada.nextInt();
			} // fimWhile

			switch (codProduto) {

			// Processamento papel

			case 1:
				System.out.println("1 – PAPEL (CAIXAS DE PAPELÃO)");

				// Terno pitagorico:

				System.out.println("Digite a largura da caixa:");
				largura = entrada.nextInt();

				while (largura > 200 || largura < 2) {
					System.out.println("Digite uma medida entre 2 e 200.");
					largura = entrada.nextInt();
				}

				System.out.println("Digite o comprimento da caixa:");
				comprimento = entrada.nextInt();

				while (comprimento > 200 || comprimento < 2) {
					System.out.println("Digite uma medida entre 2 e 200.");
					comprimento = entrada.nextInt();
				}

				largura = largura * largura;
				comprimento = comprimento * comprimento;

				ternoPitagorico = (comprimento + largura) * 0.10;
				ternoPitagorico = ternoPitagorico * 0.10;
				// peso da caixa
				System.out.println("Digite o peso da caixa:");
				peso = entrada.nextDouble();

				while (peso < 0.5 || peso > 2) {
					if (peso > 2) {
						System.out.println("Peso máximo permitido: 2kg");
						System.out.println("Digite o peso da caixa:");
						peso = entrada.nextDouble();
					} else {
						System.out.println("Peso mínimo para deposito: 0.5kg");
						System.out.println("Digite o peso da caixa:");
						peso = entrada.nextDouble();
					}
				}

				// credito
				credito = (peso * 0.20) + ternoPitagorico;
				break;

			// Processamento vidro

			case 2:
				System.out.println("2 – VIDRO (GARRAFAS DE VINHO)");

				System.out.println("Digite a quantidade de garrafas de vidro:");
				garrafaVidro = entrada.nextInt();

				while (garrafaVidro > 20) {
					System.out.println("Maximo 12 garrafas por vez.");
					System.out.println("Digite a quantidade de garrafas PET:");
					garrafaVidro = entrada.nextInt();
				}

				// Quantidade total de garrafas
				vidro += garrafaVidro;

				// Credito
				credito = garrafaVidro * 0.15;
				break;

			// Processamento alumínio
			case 3:
				System.out.println("3 – ALUMÍNIO (LATAS DE REFRIGERANTE E CERVEJA)");

				System.out.println("Digite a quantidade de latinhas sem lacre:");
				lacre0 = entrada.nextInt();
				System.out.println("Quantidade de latinhas com lacre:");
				lacre1 = entrada.nextInt();

				while (lacre0 > 30 || lacre1 > 30) {
					System.out.println("Maximo 30 latas por vez.");
					System.out.println("Digite a quantidade de latinhas sem lacre:");
					lacre0 = entrada.nextInt();
					System.out.println("Digite a quantidade de latinhas com lacre:");
					lacre1 = entrada.nextInt();
				}

				// Quantide total de latinhas
				aluminio = lacre1 + lacre0;

				litro = ((lacre0 + lacre1) * 5) / 1000;

				// Credito
				credito = (lacre1 * 0.30) + (litro * 0.25);
				break;

			// Processamento plástico
			case 4:
				System.out.println("4 – PLÁSTICO");

				System.out.println("Digite a quantidade de garrafas PET:");
				garrafaPet = entrada.nextInt();

				while (garrafaPet > 12) {
					System.out.println("Maximo 12 garrafas por vez.");
					System.out.println("Digite a quantidade de garrafas PET:");
					garrafaPet = entrada.nextInt();
				}

				// quantiadade total de garrafas PET
				plastico += garrafaPet;

				// credito
				credito = garrafaPet * 0.05;

				break;

			}// fimSwitch
		} // fimWhile

		System.out.println("Total de creditos:" + fM.format(totalCredito));

		// Maior quantidade
		while (garrafaPet >= 1 || garrafaVidro >= 1 || aluminio >= 1) {
			if (garrafaPet > garrafaVidro && garrafaPet > aluminio) {
				System.out.println("Material reciclável entregue em maior quantidade: Plástico");
			} else {
				if (garrafaVidro > garrafaPet && garrafaVidro > aluminio) {
					System.out.println("Material reciclável entregue em maior quantidade: Vidro");
				} else {
					System.out.println("Material reciclável entregue em maior quantidade: Aluminio");
				}
			}
			break;
		}

	}// fimMain
}
// fimPublic