import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ContaTerminal conta = new ContaTerminal();

        System.out.print("Por favor, digite o número da conta: ");
        conta.setNumero(scan.nextInt());
        scan.nextLine();

        System.out.print("Por favor, digite o número da agencia: ");
        conta.setAgencia(scan.nextLine());

        System.out.print("Por favor, digite o nome do cliente: ");
        conta.setNomeCliente(scan.nextLine());

        System.out.print("Por favor, digite o saldo: ");
        conta.setSaldo(scan.nextDouble());
        scan.nextLine();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d " +
                "e seu saldo %.2f já está disponível para saque", conta.getNomeCliente(), conta.getAgencia(), conta.getNumero(),
                conta.getSaldo());
    }
}