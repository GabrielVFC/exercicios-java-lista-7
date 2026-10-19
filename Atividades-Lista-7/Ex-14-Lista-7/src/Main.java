import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 14");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma nota (0 a 10): ");
        double nota = scanner.nextDouble();

        while (nota < 0 || nota > 10) {
            System.out.print("Nota inválida! Digite novamente (0 a 10): ");
            nota = scanner.nextDouble();
        }

        System.out.printf("Nota válida digitada: %d%n", nota);
        scanner.close();
    }
}