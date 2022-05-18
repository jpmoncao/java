package planosdesaude;

import java.util.Scanner;

public class PlanosDeSaude {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        String row = "--------------------------------------";
        int opcao;
        
        System.out.println("BEM-VINDO! Nosso plano de saúde corresponde a R$100,00 mais um adicional");
        
        System.out.println(row);
        
        System.out.println("Selecione a opção correspondente a sua idade:");
        System.out.println("    1) 10 anos ou menos   = R$80,00");
        System.out.println("    2) entre 10 e 30 anos = R$50,00");
        System.out.println("    3) entre 31 e 60 anos = R$95,00");
        System.out.println("    4) 60 anos ou mais    = R$130,00");
        System.out.print(">>> ");
        opcao = ler.nextInt();
        
        System.out.println(row);
        
        switch(opcao) {
            case 1:
                System.out.println("O total do seu plano ficará R$"+(100+80)+".");
                break;
            case 2:
                System.out.println("O total do seu plano ficará R$"+(100+50)+".");
                break;
            case 3:
                System.out.println("O total do seu plano ficará R$"+(100+95)+".");
                break;
            case 4:
                System.out.println("O total do seu plano ficará R$"+(100+130)+".");
                break;
            default:
                System.out.println("ERRO: Opção de plano inserida é inválida!");
            
        }
        
    }
    
}
