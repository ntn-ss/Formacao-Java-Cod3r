package controle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        String texto = "";

        do {
            if (texto!=""){
                System.out.printf("'%s' não é a resposta.\n", texto);
            }
            System.out.println("Você precisa falar as palavras mágicas.");
            System.out.print("Quer sair? ");
            texto = entrada.nextLine();
        }
        while(!texto.equalsIgnoreCase("por favor"));

        System.out.println("Gostei, agora sim.");
        entrada.close();
    }
}
