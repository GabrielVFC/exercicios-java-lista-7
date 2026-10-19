import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 7");
        Scanner sc =new Scanner(System.in);

        int soma = 0;
        int num = 0;
        int cont = 0;

        while (cont < 8){
            System.out.println("Digite um valor: ");
            num = sc.nextInt();

            if (num > 50){
                soma += num;
            } else {
                System.out.println("Número menor que 50, digite outro valor: ");
                num = sc.nextInt();
            }
            cont++;
        }

        System.out.printf("O números somados maiores que 50 deu: %d", soma);
    }
}