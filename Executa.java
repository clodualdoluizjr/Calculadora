import java.util.Scanner;

public class Executa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner captura = new Scanner(System.in);

		double n1, n2, soma, divisao, subtra�ao, multiplica�ao;
		int opera�ao;

		System.out.println("---------Calculadora---------");
		System.out.println("Digite um n�mero : ");
		n1 = captura.nextDouble();
		System.out.println("Digite outro n�mero : ");
		n2 = captura.nextDouble();

		System.out.println("Que opera��o deseja efetuar ? ");
		System.out.println(" 1 - soma ");
		System.out.println(" 2 - subtra��o ");
		System.out.println(" 3 - multuplica��o ");
		System.out.println(" 4 - divis�o ");

		System.out.println("Digite o n�mero da opera��o : ");

		opera�ao = captura.nextInt();

		if (opera�ao == 1) {
			soma = n1 + n2;
			System.out.println("A soma � " + soma);
		}
		if (opera�ao == 2) {
			subtra�ao = n1 - n2;
			System.out.println("A subtra��o � " + subtra�ao);

		}
		if (opera�ao == 3) {
			multiplica�ao = n1 * n2;
			System.out.println("A multiplica��o � : " + multiplica�ao);
		}
		if (opera�ao == 4) {
			divisao = n1 / n2;
			System.out.println("A divis�o � : " + divisao);
		}

	}

}
