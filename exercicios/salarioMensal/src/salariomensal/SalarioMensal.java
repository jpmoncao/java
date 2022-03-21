package salariomensal;

import java.util.Scanner;

public class SalarioMensal {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double salario_fixo, salario_final, valor_de_vendas;
        final double porcentagem = 5;
        
        System.out.print("Digite o sálario fixo do vendedor: R$");
        salario_fixo = input.nextDouble();
        
        System.out.print("Digite o valor das vendas: ");
        valor_de_vendas = input.nextDouble();
        
        salario_final = ((valor_de_vendas / 100) * porcentagem) + salario_fixo ;
        
        System.out.println("O vendedor ganhará por mês "+salario_final+".");
    }
    
}
