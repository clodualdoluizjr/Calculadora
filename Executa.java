import java.util.Scanner;

public class Executa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner captura = new Scanner(System.in);

		double n1, n2, soma, divisao, subtraçao, multiplicaçao;
		int operaçao;

		System.out.println("---------Calculadora---------");
		System.out.println("Digite um número : ");
		n1 = captura.nextDouble();
		System.out.println("Digite outro número : ");
		n2 = captura.nextDouble();

		System.out.println("Que operação deseja efetuar ? ");
		System.out.println(" 1 - soma ");
		System.out.println(" 2 - subtração ");
		System.out.println(" 3 - multuplicação ");
		System.out.println(" 4 - divisão ");

		System.out.println("Digite o número da operação : ");

		operaçao = captura.nextInt();

		if (operaçao == 1) {
			soma = n1 + n2;
			System.out.println("A soma é " + soma);
		}
		if (operaçao == 2) {
			subtraçao = n1 - n2;
			System.out.println("A subtração é " + subtraçao);

		}
		if (operaçao == 3) {
			multiplicaçao = n1 * n2;
			System.out.println("A multiplicação é : " + multiplicaçao);
		}
		if (operaçao == 4) {
			divisao = n1 / n2;
			System.out.println("A divisão é : " + divisao);
		}

	}

}
