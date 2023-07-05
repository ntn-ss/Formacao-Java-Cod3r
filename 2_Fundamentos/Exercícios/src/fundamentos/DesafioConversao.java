package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        // calcular a media de três salários que podem ser inseridos com casas decimais dividas por ponto ou vírgula.
        Scanner ler = new Scanner(System.in);

        System.out.println("Este programa calculará a média de três salários.");
    
        System.out.print("Insira o primeiro salário: ");
        String valor1 = ler.next().replace(",", ".");

        System.out.print("\nInsira o segundo salário: ");
        String valor2 = ler.next().replace(",", ".");
        
        System.out.print("\nInsira o terceiro salário: ");
        String valor3 = ler.next().replace(",", ".");

        ler.close();

        double salario1 = Double.parseDouble(valor1);
        double salario2 = Double.parseDouble(valor2);
        double salario3 = Double.parseDouble(valor3);
        
        double media = (salario1 + salario2 + salario3)/3;
        
        // o Locale.US serve para que os salários sejam exibidos com pontos como separadores em vez de vírgulas
        System.out.printf(Locale.US, "A média dos salários %.2f, %.2f e %.2f é de %.2f.\n", salario1, salario2, salario3, media);
    }
}