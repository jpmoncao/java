package reajustesalarial2.pkg0;

import java.util.Scanner;

public class ReajusteSalarial20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int perc = 0;
        String row = "------------------------------";
         
        while (true) {
            System.out.println(row);
            System.out.println("ESCOLHA A PROFISSÃO: ");
            System.out.println("    1) Gerente");
            System.out.println("    2) Técnico");
            System.out.println("    3) Outras");
            System.out.print(">>> ");
            int resp = input.nextInt();
            System.out.println(row);
            if (resp == 1) {
                    perc = 30;
                    break;
            }
            else if(resp == 2) {
                    perc = 50;
                    break;
            }
            else if(resp == 3) {
                    perc = 10;
                    break;
            }
            else{
                    System.out.println("A opção "+resp+" não existe, tente novamente.");
            }
        }
        
        System.out.print("Agora, digite o salário a ser reajustado: R$");
        double sal = input.nextDouble();
        System.out.println("O salário reajustado será de: R$"+(((sal/100) * perc) + sal)+".");
    }
    
}
