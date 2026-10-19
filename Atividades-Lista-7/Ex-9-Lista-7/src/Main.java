//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 9");
        Scanner scanner = new Scanner(System.in);
        int contador = 0;

        System.out.print("Digite um número (0 para sair): ");
        int numero = scanner.nextInt();

        while (numero != 0) {
            if (numero >= 20 && numero <= 80) {
                contador++;
            }
            System.out.print("Digite um número (0 para sair): ");
            numero = scanner.nextInt();
        }

        System.out.println("Quantidade de valores entre 20 e 80: " + contador);
        scanner.close();
    }
    }
