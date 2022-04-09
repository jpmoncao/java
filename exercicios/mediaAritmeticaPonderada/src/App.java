import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double n1, n2, n3;
        String row = "-----------------------------";

        System.out.print("Digite a 1ª nota: ");
        n1 = input.nextDouble();

        System.out.print("Digite a 2ª nota: ");
        n2 = input.nextDouble();

        System.out.print("Digite a 3ª nota: ");
        n3 = input.nextDouble();

        while (true) {

            System.out.println(row);
            System.out.println("Escolha uma das opções abaixo:");
            System.out.println("    1) Média Aritmética");
            System.out.println("    2) Média Ponderada");
            System.out.print(">>> ");
            int r = input.nextInt();
            System.out.println(row);

            if (r == 1) {
                System.out.println("A média final é igual: " + ((n1 + n2 + n3) / 3) + ".");
                break;
            }

            else if (r == 2) {
                System.out
                        .println("A média final é igual: " + (((n1 * 1) + (n2 * 2) + (n3 * 3)) / (n1 + n2 + n3)) + ".");
                break;
            }

            else {
                System.out.println(r + " é uma opção INVÁLIDA! Tente novamente...");
            }

        }
        ;
    }
}
