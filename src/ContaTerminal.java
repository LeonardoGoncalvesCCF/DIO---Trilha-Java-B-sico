import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {

		// Variaveis
		/*String agencia;
		int numeroConta;
		String nomeCliente;
		BigDecimal saldo;
		*/
		Scanner entrada = new Scanner(System.in); // instanciando 

		System.out.println("|--------------------------|");
		System.out.println("| Bem vindo ao Banco       |");
		System.out.println("| Escolha a opção desejada |");
		System.out.println("| 1. Abrir uma conta       |");
		System.out.println("| 2. Para sair do sistema  |");
		System.out.println("|--------------------------|");

		// iniciando opçao de Menu e pegando informação do menu
		int opcao = entrada.nextInt();

		switch (opcao) {
		case 1:
			
			registrarCliente();
		break;

		case 2:
			System.out.println("|--------------------|");
			System.out.println("| Saindo do programa |");
			System.out.println("|--------------------|");
			
		
			break;

		default:
			System.out.println("|----------------|");
			System.out.println("| Opção Invalida |");
			System.out.println("|----------------|");
			break;
 
		}
		
		entrada.close(); //fechando scanner
		
		
	}
	
	//Metodo para Registrar Cliente
	public static void registrarCliente() {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("|--------------------------------------|");
		System.out.println("| Por favor digite o numero da agencia |");
		System.out.println("|--------------------------------------|");

		String agencia = entrada.next(); // pegando a agencia
		
		System.out.println("|--------------------------------|");
		System.out.println("| Digete agora o numero da conta |");
		System.out.println("|--------------------------------|");
		
		int numeroConta = entrada.nextInt(); // pegando Numero da Conta
		
		System.out.println("|--------------------------|");
		System.out.println("| Digite o Nome do Cliente |");
		System.out.println("|--------------------------|");

		String nomeCliente = entrada.next().toUpperCase(); //Pegando nome cliente e tratando para caixa alta
		
		System.out.println("|---------------------------|");
		System.out.println("| Insira o saldo do Cliente |");
		System.out.println("|---------------------------|");


		BigDecimal saldo = entrada.nextBigDecimal(); // pegando saldo da conta
		
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------");

		System.out.println("Olá " + nomeCliente
				+ ", obrigado por criar uma conta em nosso banco, sua agência é "
				+ agencia + ", conta " + numeroConta + " e seu saldo "
				+ saldo + " já está disponível para saque");
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------");	
		
		
	}
	
	

}
