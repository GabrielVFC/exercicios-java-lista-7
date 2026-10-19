import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 11");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor inicial: ");
        double valor = scanner.nextDouble();
        int repeticoes = 0;

        while (valor <= 1000) {
            valor *= 1.05; // Aumento de 5%
            repeticoes++;
        }

        System.out.printf("Repetições necessárias: %d%n", repeticoes);
        System.out.printf("Valor final: %.2f\n", valor);
        scanner.close();
    }
}