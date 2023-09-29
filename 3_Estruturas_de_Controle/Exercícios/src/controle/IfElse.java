package controle;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a média.");
        double media = entrada.nextDouble();

        boolean criterioAprovacao = media >= 7.0 && media < 10;

        if (criterioAprovacao)
            System.out.println("Aprovado.");
        else if (media > 5.0)
            System.out.println("Recuperação.");
        else
            System.out.println("Reprovado.");

        entrada.close();
    }
}