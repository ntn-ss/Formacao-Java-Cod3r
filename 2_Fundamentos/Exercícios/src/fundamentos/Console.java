package fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        // sem linha pulada, é o que o "ln" significa
        System.out.print("Bom");
        System.out.print(" dia.\n\n");
        
        System.out.println("Bom");
        System.out.println("dia.");

        // %n cria uma nova linha
        System.out.printf("Mega Sena: %d %d %d %d %d %d.%n", 1, 2, 3, 4, 5, 6);
        
        System.out.printf("Salário: %.1f.%n", 1234.5678);
        
        System.out.printf("Nome: %s.%n", "João");

        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite o seu nome: ");
        String nome = ler.nextLine();
        
        System.out.print("Digite o seu sobrenome: ");
        String sobrenome = ler.nextLine();
        
        System.out.print("Digite a sua idade: ");
        int idade = ler.nextInt();

        System.out.printf("\nSeu nome é %s %s e você tem %d anos.%n", nome, sobrenome, idade);
        
        ler.close();
    }
}