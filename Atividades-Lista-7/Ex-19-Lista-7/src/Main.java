import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 19");
        Scanner scanner = new Scanner(System.in);
        double soma = 0;
        int contador = 0;

        System.out.print("Digite um número (0 para sair): ");
        double numero = scanner.nextDouble();

        while (numero != 0) {
            if (numero > 100) {
                soma += numero;
                contador++;
            }
            System.out.print("Digite um número (0 para sair): ");
            numero = scanner.nextDouble();
        }

        if (contador > 0) {
            System.out.printf("Média dos números maiores que 100: %d%n", (soma / contador));
        } else {
            System.out.println("Nenhum número maior que 100 foi digitado.");
        }

        scanner.close();
    }
}