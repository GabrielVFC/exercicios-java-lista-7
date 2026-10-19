import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 20");
        Scanner scanner = new Scanner(System.in);
        double total = 0;

        System.out.print("Digite o valor do produto (0 para encerrar): ");
        double valor = scanner.nextDouble();

        while (valor != 0) {
            if (valor > 0) {
                total += valor;
            }
            System.out.print("Digite o valor do produto (0 para encerrar): ");
            valor = scanner.nextDouble();
        }

        System.out.printf("Total da compra: R$ %.2f\n", total);

        double valorFinal = total;
        if (total > 500) {
            valorFinal = total * 0.90; // Aplica 10% de desconto
            System.out.println("Desconto de 10% aplicado!");
        }

        System.out.printf("Valor final: R$ %.2f\n", valorFinal);
        scanner.close();
    }
}