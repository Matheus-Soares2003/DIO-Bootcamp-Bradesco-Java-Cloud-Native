import java.util.Scanner;

public class Contador {
    public static void main(String[] args){

        int inicio, fim;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro parâmetro: ");
        inicio = scan.nextInt();
        scan.nextLine();

        System.out.print("Digite o segundo parâmetro: ");
        fim = scan.nextInt();
        scan.nextLine();

        try {
            contar(inicio, fim);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }

    }

    static void contar(int num1, int num2) throws ParametrosInvalidosException {
        if (num1 > num2) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        for (int i = num1; i <= num2; i++){
            System.out.println("Imprimindo o número " + i);
        }
    }
}