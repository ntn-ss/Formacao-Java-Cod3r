package controle;

import java.util.Scanner;

public class WhileIndeterminado {
    public static void main(String[] args) {
        String palavraQueEncerra = "Sair";
        
        Scanner ler = new Scanner(System.in);

        String input = "";

        while(!input.equalsIgnoreCase(palavraQueEncerra)) {
            System.out.print("DIGITE ALGUMA COISA: ");
            input = ler.nextLine();
            System.out.printf("Você digitou '%s'.\n", input);
        }
        ler.close();
        System.out.println("Fim.");
    }
}
