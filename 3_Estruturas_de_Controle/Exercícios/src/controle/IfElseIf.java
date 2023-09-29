package controle;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a nota: ");
        double nota = entrada.nextDouble();

        if (nota>10 || nota<0)
            System.out.println("Nota inválida.");
        else if (nota >= 9)
            System.out.println("Aprovado com desconto na mensalidade.");
        else if (nota >= 7)
            System.out.println("Aprovado.");
        else if (nota >= 5)
            System.out.println("Recuperação.");
        else if (nota >= 4)
            System.out.println("Conselho de classe.");
        else
            System.out.println("Reprovado.");

        System.out.println("Fim.");
        
        entrada.close();
    }
}
