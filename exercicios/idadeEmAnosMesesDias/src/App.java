import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int idade, ano_atual, ano_nasc, meses, dias, horas, bissexto;

        System.out.print("Digite sua idade: ");
        idade = input.nextInt();

        ano_atual = 2022;
        ano_nasc = 2022 - idade;
        meses = idade * 12;
        dias = idade * 365;

        int c;
        for (c = ano_nasc, bissexto = 0; c <= ano_atual; c++) {

            if (c % 4 == 0 && c % 100 != 0 || c % 400 == 0) {
                bissexto = bissexto + 1;
            }
        }
        
        horas = (dias + bissexto) * 24;
        
        System.out.println("Você tem " + idade + " anos, " + meses + " meses, " + (dias + bissexto) + " dias ("
                + dias + " + " + bissexto + " dias de ano bissexto) e aproximadamente " + horas +" horas.");
        }
    }
}
