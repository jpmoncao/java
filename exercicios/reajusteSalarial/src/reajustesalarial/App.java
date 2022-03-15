package reajustesalarial;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String nome;
            double salario, reajuste;

            System.out.print("Qual o nome do funcionário?: ");
            nome = input.next();

            System.out.print("Qual o salário do funcionário?: ");
            salario = input.nextDouble();
            reajuste = ((salario / 100) * 20) + salario;

            System.out
                    .println("O funcionário " + nome + ", depois de um reajuste de 20%, receberá R$" + reajuste + ".");
        }

    }
}
