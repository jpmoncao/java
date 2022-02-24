package revisao;

import java.util.Scanner;

public class Revisao {
    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       String nome; // Toda string é declarada em maiusuculo, e não str.
       int idade, anoNasc;
       
       //Cabeçalho
       System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
       System.out.println("Sejam bem vindos ao curso de Informática!!");
       System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
       
       //Nome
       System.out.print("Qual seu nome?: ");
       nome = input.next();
       
       //Idade
       System.out.print("Qual seu ano de nascimento?: ");
       anoNasc = input.nextInt();
       idade = 2022 - anoNasc;
       
       // Show infos
       System.out.println("Olá, " +nome +". Você tem " +idade +" anos de idade.");
       System.out.println("Prazer em conhece-lô!");     
    }
    
}
