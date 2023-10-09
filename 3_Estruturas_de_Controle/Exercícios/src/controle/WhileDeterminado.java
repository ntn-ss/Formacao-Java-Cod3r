package controle;

import java.util.Scanner;

public class WhileDeterminado {
    public static int faltando (int vezesBomDia, int x){
        return vezesBomDia - x;
    }
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Quantas vezes você quer ouvir 'bom dia'? ");
        int vezesBomDia = ler.nextInt();
        int x = 0;

        while(x<vezesBomDia){
            System.out.println("Bom dia!");
            x++;
            if (faltando(vezesBomDia, x) > 1) {
                System.out.printf("A linha repetirá mais %d vezes.\n", faltando(vezesBomDia, x));
            }
            else if (faltando(vezesBomDia, x) == 1) {
                System.out.printf("A linha repetirá mais %d vez.\n", faltando(vezesBomDia, x));
            }
            else {
                System.out.println("Fim.");
            }
        }
        ler.close();
    }
}