package mediaaluno;

import java.util.Scanner;

public class MediaAluno {  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double n1, n2, n3, n4;
        
        System.out.print("Digite a 1ª nota: ");
        n1 = input.nextDouble();
        
        System.out.print("Digite a 2ª nota: ");
        n2 = input.nextDouble();
        
        System.out.print("Digite a 3ª nota: ");
        n3 = input.nextDouble();
        
        System.out.print("Digite a 4ª nota: ");
        n4 = input.nextDouble();
        
        double media = (n1+n2+n3+n4) / 4;
        System.out.print("O aluno teve média de "+media+" e foi");
        
        if (media < 5) {
            System.out.println(" REPROVADO.");
            
        } else if (media >= 5 && media < 6) {
            System.out.println(" APROVADO com PROGRESSÃO PARCIAL.");
            
        } else if (media >= 6 && media < 8) {
            System.out.println(" APROVADO.");
            
        } else {
            System.out.println(" APROVADO com EXCELÊNCIA!");
        }
        
    }
    
}
