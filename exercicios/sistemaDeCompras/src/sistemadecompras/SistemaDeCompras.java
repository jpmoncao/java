package sistemadecompras;

import java.util.Scanner;

public class SistemaDeCompras {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String row = "-------------------------------------------------------------";
        double pt = 0;

        System.out.println("BEM-VINDO ao sistema de códigos da empressa, para começar...");
        while (true) {
            System.out.println(row);
            System.out.print("Digite o código do produto: ");
            int cod = input.nextInt();
            boolean cond = true;

            switch (cod) {
                case 100:
                    pt = 5.40;
                    break;
                case 101:
                    pt = 12.00;
                    break;
                case 102:
                    pt = 25.00;
                    break;
                case 103:
                    pt = 30.30;
                    break;
                default:
                    System.out.println(row);
                    System.out.println("ERRO: Código " + cod + " não existe no sistema.");
                    cond = false;
                    break;
            }
            if (cond) {
                break;
            }
        }

        double quant = -1;
        while (quant < 0) {
            System.out.print("Digite a quantidade comprada do produto: ");
            quant = input.nextInt();
        }
        double valorFinal = quant * pt;
        double valorDesc = valorFinal - (valorFinal * 0.15);

        System.out.println(row);
        System.out.print("O valor total será de R$ ");

        if (valorFinal > 100) {
            System.out.println(valorDesc + ", devido o desconto de 15%!");
        } else {
            System.out.println(valorFinal + ".");
        }
        System.out.println(row);
    }

}
