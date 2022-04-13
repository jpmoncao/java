package reajustesalarial2.pkg0;

import java.util.Scanner;

public class ReajusteSalarial20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int perc;
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
            switch (resp) {
                case 1:
                    perc = 30;
                case 2:
                    perc = 50;
                case 3:
                    perc = 10;
                default:
                    System.out.println("A opção "+resp+" não existe, tente novamente.");
            }
        }
    
    }
    
}
