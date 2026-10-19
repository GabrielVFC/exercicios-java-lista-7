import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 1");
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor limite pra soma: ");
        int limite = sc.nextInt();
        int soma = 0;
        while (soma <= limite){

            System.out.println("Digite um valor pra somar: ");
            int num = sc.nextInt();
            soma += num;
        }

        System.out.printf("O valor total da soma é: %d%n", soma);
    }
}