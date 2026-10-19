import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 8");
        Scanner sc = new Scanner(System.in);
        int num = -1;

        while (num != 0){
            System.out.println("Digite um valor pra ver se é multiplo de 5: ");
            num = sc.nextInt();

            if (num % 5 == 0){
                System.out.printf("O número %d é multiplo de 5%n", num);
            }
        }
    }
}