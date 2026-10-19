import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 15");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        int senha = scanner.nextInt();

        while (senha != 1234) {
            System.out.print("Senha incorreta! Tente novamente: ");
            senha = scanner.nextInt();
        }

        System.out.println("Acesso permitido!");
        scanner.close();
    }
}