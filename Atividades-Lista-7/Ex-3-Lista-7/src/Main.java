import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 3");
        Scanner sc = new Scanner(System.in);

        int num = -1;
        int soma = 0;

        while (num != 0){

            System.out.println("Digite um número: ");
            num = sc.nextInt();

            if (num % 3 == 0){
                soma += num;
            }
        }

        System.out.printf("A soma dos multiplos de 3 é de %d%n", soma);
    }
}