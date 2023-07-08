package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
    public static void main(String[] args) {
        // o fato de isto retornar verdadeiro pode fazer pensar que quaisquer strings poderão ser comparadas assim, mas muitas vezes não funciona, e isso dá problemas.
        System.out.println("2" == "2");
        
        String s1 = new String("2");
        System.out.println("2" == s1);
        
        // o equals compara os valores e não entra em outras questões das linguagem.
        System.out.println("2".equals(s1));

        Scanner entrada = new Scanner(System.in);

        // para testar o trim, abaixo, foi necessário mudar o método do scanner para nextLine, já que o anterior, next, tira os espaços por si só, e o outro não.
        String s2 = entrada.nextLine();

        // o método "trim", do tipo String, elimina os espaços em branco dela.
        System.out.println("2" == s2.trim());
        System.out.println("2".equals(s2.trim()));

        entrada.close();
    }
}
