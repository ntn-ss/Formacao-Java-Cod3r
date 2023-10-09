package controle;

import javax.swing.JOptionPane;

public class For1 {
    public static int faltando (int vezesBomDia, int x){
        return vezesBomDia - x;
    }
    public static void main(String[] args) {
        String inputVezesBomDia = JOptionPane.showInputDialog("Quantas vezes você quer ouvir 'bom dia'?");
        int vezesBomDia = Integer.parseInt(inputVezesBomDia);

        System.out.printf("Direi 'bom dia' %d vezes.\n\n", vezesBomDia);

        for (int x = 1; x<=vezesBomDia; x++){
            System.out.println("Bom dia!");
            if (faltando(vezesBomDia, x) > 1) {
                System.out.printf("Repetirei mais %d vezes.\n", faltando(vezesBomDia, x));
            }
            else if (faltando(vezesBomDia, x) == 1) {
                System.out.printf("Repetirei mais %d vez.\n", faltando(vezesBomDia, x));
            }
            else {
                System.out.println("Fim.");
            }
        }
    }
}