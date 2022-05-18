package salariobruto;

import java.util.Scanner;

public class SalarioBruto {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        String nome, row = "---------------------------------";
        int ht, filhos;
        double vht, salFamiliar, salBruto;
        
        System.out.print("Digite seu nome: ");
        nome = ler.next();
        
        System.out.print("Digite o número de horas trabalhadas: ");
        ht = ler.nextInt();
        
        System.out.print("Digite o valor por horas trabalhadas: R$");
        vht = ler.nextDouble();
        
        System.out.print("Digite o número de filhos menores de 15 anos: ");
        filhos = ler.nextInt();
        
        System.out.println("Digite o valor do seu salário familiar: R$");
        salFamiliar = ler.nextDouble();
        
        System.out.println(row);
        
        salBruto = (vht * ht) + (salFamiliar * filhos);
        double salTotal = salBruto - (salBruto*(8.5/100));
        
        System.out.println("O seu salário bruto é: R$"+salBruto);
        System.out.println("O seu sálario descontado pelo INSS é: R$"+salTotal);
        System.out.print("Seu imposto de renda será: R$");
        
        
        if (salTotal > 1500) {
            double ir = 15 / 100;
            System.out.println(salTotal * ir);
        } else if (salTotal > 500 && salTotal <= 1500) {
            double ir = 8 / 100;
            System.out.println(salTotal * ir);
        } else {
            double ir = 0 / 100;
            System.out.println(salTotal * ir);
        }
    }
    
}
