package diasdasemana;

import java.util.Scanner;

public class DiasDaSemana {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int dia;
        
        System.out.print("Indique um dia da semana em números: ");
        dia = ler.nextInt();
        
        switch (dia) {
            case 1, 7: // Determina caso for o dia 1(domingo) e o dia 7(sábado)
                System.out.println("Hoje é um fim de semana");
                break;
                
            case 2, 3, 4, 5, 6: // Determina caso for os dias entre 2 e 6 (dias úteis)
                System.out.println("Hoje é um dia útil");
                break;
                
            default:
                System.out.println("ERRO: Número "+dia+" é inválido!");
                break;
        }
    }
    
}
