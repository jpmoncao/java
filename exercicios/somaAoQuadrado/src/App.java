import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1, n2, n3, n4, soma;

        System.out.print("Digite o 1º número: ");
        n1 = input.nextInt();

        System.out.print("Digite o 2º número: ");
        n2 = input.nextInt();

        System.out.print("Digite o 3º número: ");
        n3 = input.nextInt();

        System.out.print("Digite o 4º número: ");
        n4 = input.nextInt();

        soma = (n1 * n1) + (n2 * n2) + (n3 * n3) + (n4 * n4);
        System.out.println("O resultado da soma dos quadrados é: " + soma + ".");
    }
}
