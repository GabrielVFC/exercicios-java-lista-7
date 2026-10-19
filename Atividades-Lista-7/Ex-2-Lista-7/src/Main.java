import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 2");
        Scanner sc = new Scanner(System.in);

        int num = -1;

        while (num != 0){
            System.out.println("Digite um número: ");
            num = sc.nextInt();

            if (num > 10){
                System.out.printf("Esse número %d é maior que 10%n", num);
            } else if (num == 10) {
                System.out.printf("O número digitado é igual a 10%n");
            } else {
                System.out.printf("Esse número %d é menor que 10%n", num);
            }
        }
        System.out.println("Você digitou zero, programa encerrado!");
    }
}