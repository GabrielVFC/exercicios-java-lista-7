import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 16");
        Scanner scanner = new Scanner(System.in);
        int contador = 0;

        System.out.print("Digite um número (0 para sair): ");
        int numero = scanner.nextInt();

        while (numero != 0) {
            if (numero >= 10 && numero <= 50) {
                contador++;
            }
            System.out.print("Digite um número (0 para sair): ");
            numero = scanner.nextInt();
        }

        System.out.printf("Quantidade de números entre 10 e 50: %d", contador);
        scanner.close();
    }
}