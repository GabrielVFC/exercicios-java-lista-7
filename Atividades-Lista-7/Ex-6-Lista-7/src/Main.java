import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 6");
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: (use 0 para sair)");
        int num = sc.nextInt();

        if (num == 0){
            System.out.println("Nenhum número valido digitado");
        } else {
            int numMaior = num;
            int numMenor = num;

            while (num != 0){
                if (num > numMaior){
                    numMaior = num;
                } else if (num < numMenor) {
                    numMenor = num;
                }

                System.out.println("Digite um valor: (use 0 para sair)");
                num = sc.nextInt();
            }

            System.out.printf("Maior valor digitado: %d%n", numMaior);
            System.out.printf("Menor valor digitado: %d%n", numMenor);
        }


    }
}