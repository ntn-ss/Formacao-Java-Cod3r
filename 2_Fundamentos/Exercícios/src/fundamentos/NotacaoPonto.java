package fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {
        String s = "Bom dia, X";
        
        s = s.replace("X", "Chapa");
        s = s.toUpperCase();
        s = s.concat(".");
        
        System.out.println(s);

        String y = "Bom dia, X"
                    .replace("X", "Nathan")
                    .toUpperCase()
                    .concat(".");
        
        System.out.println(y);

        // Tipos primitivos não têm o operador ".", nada de atributos ou comportamentos neles.
        int a = 3;
        System.out.println(a);
    }
}
