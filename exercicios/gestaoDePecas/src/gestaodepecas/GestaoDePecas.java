package gestaodepecas;

import java.util.Scanner;

public class GestaoDePecas {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String id;
        int vendas;
        double preco, preco_estoque, ipi, valor_final;
        
        System.out.print("Digite o ID da peça [#000000]: #");
        id = input.next();
        
        System.out.print("Digite a quantidade de peças vendidas: ");
        vendas = input.nextInt();
        
        System.out.print("Digite o preço unitário: R$");
        preco = input.nextDouble();
        
        System.out.print("Digite a porcentagem de IPI: ");
        ipi = input.nextDouble();
        
        preco_estoque = vendas * preco;
        valor_final = ((preco_estoque / 100) * ipi) + preco_estoque;
        System.out.println("O produto #"+id+", vendeu "+vendas+" unidades, faturando um total de R$"+valor_final);
    }
    
}
