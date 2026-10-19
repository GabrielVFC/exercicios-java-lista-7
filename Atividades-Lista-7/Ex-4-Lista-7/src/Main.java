import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 4");
        Scanner sc = new Scanner(System.in);

        int soma = 0;
        int cont = 0;

        System.out.println("Digite um valor: (coloque um número negativo para sair)");
        int num = sc.nextInt();

        while (num >= 0){
            soma += num;
            cont++;

            System.out.println("Digite um valor: (coloque um número negativo para sair)");
            num = sc.nextInt();
        }

        if (cont > 0){
            double media = (double) soma / cont;
            System.out.printf("A média dos números positivos é: %.2f%n", media);
        } else {
            System.out.println("Nenhum número positivo foi digitado!");
        }
    }
}