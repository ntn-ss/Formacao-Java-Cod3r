package fundamentos;

import java.util.Date;

public class Import {
    public static void main(String[] args) {
        // a biblioteca java.lang é a mais básica do Java, então tudo seu está disponível nativamente em todas as classes.
        java.lang.String s = "Bom dia!";
        java.lang.System.out.println(s);

        Date d = new Date();
        System.out.println(d);
    }
}
