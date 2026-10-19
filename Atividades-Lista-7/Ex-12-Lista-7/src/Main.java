import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 12");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número maior que 1: ");
        double valor = scanner.nextDouble();
        int divisoes = 0;

        while (valor / 2 > 1) {
            valor /= 2;
            divisoes++;
        }

        System.out.printf("Divisões realizadas: %d%n", divisoes);
        System.out.printf("Resultado final: %.2f\n", valor);
        scanner.close();
    }
}