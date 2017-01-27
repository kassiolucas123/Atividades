import java.util.InputMismatchException;
import java.util.Scanner;

public class TestandoException {
	public static void main(String a[]) {
		Scanner teclado = new Scanner(System.in);
		int mes;
		String meses[] = { "Janeiro", "Fevereiro", "Mar�o", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
				"Outubro", "Novembro", "Dezembro" };

		mes = 999;
		while (mes != 0) {
			System.out.print("Digite o n�mero do m�s (0 para Fim): ");
			try {
				mes = teclado.nextInt();
				System.out.println("Nome do m�s = " + meses[mes - 1]);
			} catch (InputMismatchException e) {
				System.out.println("Entrada inv�lida!!!");
				teclado.nextLine();
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("N�mero do m�s inv�lido!");
				teclado.nextLine();
			}

		}
		System.out.println("FIM DO PROGRAMA");
	}

}
