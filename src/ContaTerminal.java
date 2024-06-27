import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitação e leitura dos dados do usuário
        System.out.print("Por favor, digite o número da Agência: ");
        int numeroAgencia = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Por favor, digite o número da Conta: ");
        String numeroConta = scanner.nextLine(); // Lê o número da conta como String

        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo da Conta: ");
        double saldo = scanner.nextDouble();

        // Exibição da mensagem final
        String mensagemFinal = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + 
                              ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.";
        System.out.println(mensagemFinal);
    }
}
