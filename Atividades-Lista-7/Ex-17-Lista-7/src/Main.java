import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 17");
        Scanner scanner = new Scanner(System.in);
        int somaPares = 0;

        System.out.print("Digite um número (0 para sair): ");
        int numero = scanner.nextInt();

        while (numero != 0) {
            if (numero % 2 == 0) {
                somaPares += numero;
            }
            System.out.print("Digite um número (0 para sair): ");
            numero = scanner.nextInt();
        }

        System.out.printf("Soma dos números pares: %d%n", somaPares);
        scanner.close();
    }
}