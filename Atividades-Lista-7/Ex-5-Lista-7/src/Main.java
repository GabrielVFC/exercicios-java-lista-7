import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 5");
        Scanner sc = new Scanner(System.in);

        int num = -1;

        while (num != 0){
            System.out.println("Digite um número para ver o dobro do seu valor: ");
            num = sc.nextInt();

            if (num != 0){
                int quadrado = (int) Math.pow(num, 2);

                System.out.printf("O número %d o dobro dele é %d%n", num, quadrado);
            }
        }

        System.out.println("Você digitou zero, programa encerrado!");
    }
}