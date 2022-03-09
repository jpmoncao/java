package somarnumero;

import java.util.Scanner;

public class SomarNumero {

    public static void main(String[] args) {

        try (
                // Declara do método Scanner o objeto ler
                Scanner ler = new Scanner(System.in))
                
        {
            /*
             * int = inteiros
             * double = reais
             */
            int n1, n2, n3, r;

            // Imprimi "Digite o primeiro número: "
            System.out.print("Digite o primeiro número: ");
            // Cria um input e atribui em n1
            n1 = ler.nextInt();

            System.out.print("Digite o segundo número: ");
            n2 = ler.nextInt();

            System.out.print("Digite o terceiro número: ");
            n3 = ler.nextInt();

            r = n1 + n2 + n3;
            System.out.println("A soma é igual a: " + r);
        }
    }
}
