import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {

		// Variaveis
		String agencia;
		int numeroConta;
		String nomeCliente;
		BigDecimal saldo;

		Scanner entrada = new Scanner(System.in);

		System.out.println("----------------------------");
		System.out.println("| Bem vindo ao Banco       |");
		System.out.println("| Escolha a opção desejada | ");
		System.out.println("| 1. Abrir uma conta       |");
		System.out.println("| 2. Para sair do sistema  |");
		System.out.println("----------------------------");

		// iniciando opçao de Menu e pegando informação do menu
		int opcao = entrada.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("----------------------------------------");
			System.out.println("| Por favor digite o numero da agencia |");
			System.out.println("----------------------------------------");

			agencia = entrada.next();

			System.out.println("| Digete agora o numero da conta |");

			numeroConta = entrada.nextInt();

			System.out.println("| Digite o Nome do Cliente | ");

			nomeCliente = entrada.next().toUpperCase(); //Pegando nome cliente e tratando para caixa alta

			System.out.println("| Insira o saldo do Cliente |");

			saldo = entrada.nextBigDecimal();

			System.out.println("Olá " + nomeCliente
					+ ", obrigado por criar uma conta em nosso banco, sua agência é "
					+ agencia + ", conta " + numeroConta + " e seu saldo "
					+ saldo + " já está disponível para saque");

			break;

		case 2:
			System.out.println("------------------");
			System.out.println("Saindo do programa");
			System.out.println("------------------");
			break;

		default:
			System.out.println(" Opção Invalida ");
			break;

		}

	}

}
