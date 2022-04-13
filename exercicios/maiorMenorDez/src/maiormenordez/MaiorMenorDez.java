package maiormenordez;

import java.util.Scanner;

public class MaiorMenorDez {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = input.nextInt();

        if (n >= 10)
            System.out.println("O número " + n + " é maior ou igual a 10.");
        else
            System.out.println("O número " + n + " é menor que 10.");
    }
    
}
