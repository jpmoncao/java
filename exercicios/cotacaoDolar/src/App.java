import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        double dolar, real, resultado;

        dolar = 5.16;

        System.out.print("Insira o valor em reais: R$");
        real = input.nextDouble();

        resultado = real * dolar;
        System.out.println("Levando em conta a cotação do dólar de $" + dolar);
        System.out.println("O valor de R$" + real + "em doláres é $" + resultado);
    }
}
