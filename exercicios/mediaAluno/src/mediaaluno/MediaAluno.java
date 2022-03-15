package mediaaluno;

import java.util.Scanner;

public class MediaAluno {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double nota1, nota2, nota3, nota4, media;
        String nome;
        
        System.out.print("Digite o nome do aluno: ");
        nome = input.next();
        
        System.out.print("Nota do 1º bimestre: ");
        nota1 = input.nextDouble();
        
        System.out.print("Nota do 2º bimestre: ");
        nota2 = input.nextDouble();
        
        System.out.print("Nota do 3º bimestre: ");
        nota3 = input.nextDouble();
        
        System.out.print("Nota do 4º bimestre: ");
        nota4 = input.nextDouble();
        
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A média do aluno: "+ nome+" foi "+media+".");
    }
    
}
