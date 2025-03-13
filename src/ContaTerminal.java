
import java.util.Scanner;

/**
 *
 * @author luizhenrique
 */
public class ContaTerminal {

    public static void main(String[] args) {
        System.out.println("Desafio: Projeto Conta Terminal");

        int numero;
        String agencia;
        String nomeCliente;
        Double saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Por Favteor, Digite o nome do Cliente: ");
        nomeCliente = scanner.nextLine();

        System.out.print("Por Favor, Digite o número da agencia: ");
        agencia = scanner.nextLine();

        System.out.print("Por Favor, Digite o número da conta: ");
        numero = scanner.nextInt();

        System.out.print("Por Favor, Digite o Saldo: ");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua Agência é " + agencia + ", conta " + numero + "e seu saldo " + saldo + " já está disponivel para saque");
    }
}
