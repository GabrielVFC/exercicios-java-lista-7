import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 18");
        Scanner scanner = new Scanner(System.in);
        int maiores50 = 0;
        int menores20 = 0;
        int contador = 0;

        while (contador < 10) {
            System.out.printf("Digite o %d%nº número: ", (contador + 1));
            int numero = scanner.nextInt();

            if (numero > 50) {
                maiores50++;
            }
            if (numero < 20) {
                menores20++;
            }

            contador++;
        }

        System.out.printf("Números maiores que 50: %d%n", maiores50);
        System.out.printf("Números menores que 20: %d%n", menores20);
        scanner.close();
    }
}