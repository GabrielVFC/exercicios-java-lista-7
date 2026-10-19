import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 13");
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        double soma = 0;

        System.out.print("Digite um número (0 para sair): ");
        double numero = scanner.nextDouble();

        while (numero != 0) {
            soma += numero;
            contador++;
            System.out.print("Digite um número (0 para sair): ");
            numero = scanner.nextDouble();
        }

        System.out.printf("Quantidade de números digitados: %d%n", contador);
        System.out.printf("Soma total: %d%n", soma);

        if (contador > 0) {
            System.out.printf("Média: %d%n", (soma / contador));
        } else {
            System.out.println("Média: N/A (nenhum número foi digitado)");
        }

        scanner.close();
    }
}