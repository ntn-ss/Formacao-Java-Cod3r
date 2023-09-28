package fundamentos.desafios;

import javax.swing.JOptionPane;

public class DesafioLogicos {
    public static void main(String[] args) {
        // Tu terás dois trabalhos nesta semana: um na terça-feira (que pode dar certo ou não, isto é, V ou F) e outro na quinta-feira (que também pode dar certo ou não). Tu prometeste à tua família que, caso logre êxito em ambos os trabalhos, comprarás uma televisão de 50 polegadeas à tua família no fim de semana. Se apenas um deles der certo, tu comprarás uma de 32, e tu também prometeste que, caso a família vá ao shopping (isto é, qualquer TV for comprada), todos tomarão sorvete juntos, comemorando a compra da TV. O único cenário em que nada disso acontecerá será quando ambos os trabalhos derem errado, isto é, a família será mais saudável, por não ingerir o doce.

        boolean foiAoShopping = false;
        boolean comprouTV50 = false;
        boolean comprouTV32 = false;
        boolean tomaramSorvete = false;
        boolean permaneceramSaudaveis = true;

        boolean trabalho1 = Boolean.parseBoolean((JOptionPane.showInputDialog(
            "Qual foi o resultado do primeiro trabalho, o da terça-feira? (true ou false)")));
        
        boolean trabalho2 = Boolean.parseBoolean((JOptionPane.showInputDialog(
            "Qual foi o resultado do segundo trabalho, o da quinta-feira? (true ou false)")));

        if (trabalho1 && trabalho2) {
            System.out.println("Comprou a TV de 50 polegadas.");
            comprouTV50 = true;
            foiAoShopping = true;
        }
        
        if (trabalho1 ^ trabalho2) {
            System.out.println("Comprou a TV de 32 polegadas.");
            comprouTV32 = true;
            foiAoShopping = true;
        }

        if (foiAoShopping) {
            System.out.println("Foram ao shopping e tomaram sorvete.");
            tomaramSorvete = true;
            permaneceramSaudaveis = !tomaramSorvete;
        }
        if (!foiAoShopping) {
            System.out.println("A família não comprou TV alguma e permaneceu saudável");
        }

        System.out.printf("\nResumo: Comprou TV de 50? %s, Comprou TV de 32? %s, Tomaram sorvete? %s, Permaneceram saudáveis? %s.\n", comprouTV50, comprouTV32, tomaramSorvete, permaneceramSaudaveis);
    }
}